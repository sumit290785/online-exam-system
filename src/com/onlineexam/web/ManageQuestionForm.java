package com.onlineexam.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.faces.model.SelectItem;

import com.onlineexam.domain.Category;
import com.onlineexam.domain.Option;
import com.onlineexam.domain.Question;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.QuestionService;

public class ManageQuestionForm {
	private static final String forword_list = "list";
	private static final String forword_edit = "edit";
	private int selectedID;
	private String questionContent;
	private String category;
	private List questionList;
	private SelectItem[] categoryList;
	private List optionList;
	private OptionBean opt1=new OptionBean();
	private OptionBean opt2=new OptionBean();
	private OptionBean opt3=new OptionBean();
	private OptionBean opt4=new OptionBean();
	private OptionBean opt5=new OptionBean();
	private OptionBean opt6=new OptionBean();
	private ServiceHandler sh = ServiceHandler.getInstance();
	private String errorMessage = "";
	
	private QuestionService qs = (QuestionService) sh
			.getService("questionService");
	
	public ManageQuestionForm(){
		this.setQuestionList(qs.getAllQuestions());		
	}

	public String editQuestion() {
		Question question = qs.getQuestionByID(selectedID);
		this.setCategory(question.getCategory().getCategoryName());
		this.setQuestionContent(question.getQuestionContent());
		this.setSelectedID(this.getSelectedID());
		List<Option> optList = new ArrayList(question.getOptions());
		for (int i = 0; i < optList.size(); i++) {
			Option option = optList.get(i);
			this.initOptionBeanList(i, option);
		}
		return forword_edit;
	}
	
	public String initQuestion(){
		this.setCategory("");
		this.setOpt1(new OptionBean());
		this.setOpt1(new OptionBean());
		this.setOpt1(new OptionBean());
		this.setOpt1(new OptionBean());
		this.setOpt1(new OptionBean());
		this.setOpt1(new OptionBean());
		return forword_edit;
	}

	public String saveQuestion() {
		errorMessage="";
		if(questionContent!=null&&questionContent.length()==0)
			errorMessage=errorMessage+"question content can't be null!";
		List<OptionBean> list = this.getNotEmptlyOptionList();
		if (list.size()<3){
			errorMessage=errorMessage+"option counts must be greater than 3!";
		}
		boolean isCorrectSet = false;
		for (int i=0;i<list.size();i++)
		{
			if (list.get(i).isCorrect()) {isCorrectSet = true; break;}
		}
		if(!isCorrectSet)
			errorMessage=errorMessage+" at least 1 correct answer must be set!";
		if (errorMessage.equals("")){
		try {
			Question question;
			this.optionList = new ArrayList();
			if (selectedID > 0) {
				question = qs.getQuestionByID(selectedID);
				Category c = qs.getCategoryByName(this.getCategory());
				question.setCategory(c);
				updateOption(opt1);
				updateOption(opt2);
				updateOption(opt3);
				updateOption(opt4);
				updateOption(opt5);
				updateOption(opt6);
				question.setQuestionContent(questionContent);
				question.setOptions(new HashSet(optionList));
				question = qs.updateQuestion(question);
			} else {
				question = new Question();
				Category c = qs.getCategoryByName(this.getCategory());
				question.setCategory(c);
				updateOption(opt1);
				updateOption(opt2);
				updateOption(opt3);
				updateOption(opt4);
				updateOption(opt5);
				updateOption(opt6);
				question.setOptions(new HashSet(optionList));
				question.setQuestionContent(questionContent);
				question = qs.addQuestion(question);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
		this.setQuestionList(qs.getAllQuestions());
		if (!errorMessage.equals(""))
			return forword_edit;
		return forword_list;
	}
	
	private List<OptionBean> getNotEmptlyOptionList(){
		List<OptionBean> list = new ArrayList<OptionBean>();
		if (opt1!=null&&opt1.getOption()!=null&&opt1.getOption().length()>0){
			list.add(opt1);
		}
		if (opt2!=null&&opt1.getOption()!=null&&opt2.getOption().length()>0){
			list.add(opt2);
		}
		if (opt3!=null&&opt3.getOption()!=null&&opt3.getOption().length()>0){
			list.add(opt3);
		}
		if (opt4!=null&&opt4.getOption()!=null&&opt4.getOption().length()>0){
			list.add(opt4);
		}
		if (opt5!=null&&opt5.getOption()!=null&&opt5.getOption().length()>0){
			list.add(opt5);
		}
		if (opt6!=null&&opt6.getOption()!=null&&opt6.getOption().length()>0){
			list.add(opt6);
		}
		return list;
	}

	private void updateOption(OptionBean opt) {
		Option option;
		if (opt.getId() == 0 && opt.getOption().length() == 0)
			return;
		/**
		 * remove option
		 */
		if (opt.getId() > 0 && opt.getOption().length() == 0) {
//			qs.removeOption(opt.getId());
			return;
		}
		;
		/**
		 * update option
		 */
		if (opt.getId() > 0 && opt.getOption().length() > 0) {
			option = qs.getOptionByID(opt.getId());
			option.setCorrect(opt.isCorrect());
			option.setOptionContent(opt.getOption());
			qs.updateOption(option);
			this.optionList.add(option);
			return;
		}

		/**
		 * new option added
		 */
		if (opt.getId() == 0 && opt.getOption().length() > 0) {
			option = new Option();
			option.setCorrect(opt.isCorrect());
			option.setOptionContent(opt.getOption());
			this.optionList.add(option);
			return;
		}
		return;
	}

	public int getSelectedID() {
		return selectedID;
	}

	public void setSelectedID(int selectedID) {
		this.selectedID = selectedID;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List getQuestionList() {
		return this.questionList;
	}

	public void setQuestionList(List questionList) {
		this.questionList = questionList;
	}

	public SelectItem[] getCategoryList() {
		List<Category> cList = qs.getAllCategories();
		List<String> result = new ArrayList();
		int m = 0;
		// // if (categoryList == null){
		// categoryList = new SelectItem[2];
		// categoryList[0]= new SelectItem("12","34");
		// categoryList[1]= new SelectItem("32","344");
		// // }
		// this.setCategory("12");

		categoryList = new SelectItem[cList.size()];
		for (int i = 0; i < cList.size(); i++) {
			m = i;
			categoryList[m] = new SelectItem(cList.get(m).getCategoryName());
		}
		return categoryList;
	}

	public void setCategoryList(SelectItem[] categoryList) {
		this.categoryList = categoryList;
	}

	public OptionBean getOpt1() {
		return opt1;
	}

	public OptionBean getOpt2() {
		return opt2;
	}

	public void setOpt2(OptionBean opt2) {
		this.opt2 = opt2;
	}

	public OptionBean getOpt3() {
		return opt3;
	}

	public void setOpt3(OptionBean opt3) {
		this.opt3 = opt3;
	}

	public void setOpt1(OptionBean opt1) {
		this.opt1 = opt1;
	}

	private void initOptionBeanList(int i, Option option) {
		OptionBean opb = new OptionBean();
		opb.setCorrect(option.isCorrect());
		opb.setId(option.getId());
		opb.setOption(option.getOptionContent());
		if (i == 0)
			this.setOpt1(opb);
		if (i == 1)
			this.setOpt2(opb);
		if (i == 2)
			this.setOpt3(opb);
		if (i == 3)
			this.setOpt4(opb);
		if (i == 4)
			this.setOpt5(opb);
		if (i == 5)
			this.setOpt6(opb);
		return;
	}

	public OptionBean getOpt4() {
		return opt4;
	}

	public void setOpt4(OptionBean opt4) {
		this.opt4 = opt4;
	}

	public OptionBean getOpt5() {
		return opt5;
	}

	public void setOpt5(OptionBean opt5) {
		this.opt5 = opt5;
	}

	public OptionBean getOpt6() {
		return opt6;
	}

	public void setOpt6(OptionBean opt6) {
		this.opt6 = opt6;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
