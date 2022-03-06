package co.com.choucair.certification.retot.questions;

import co.com.choucair.certification.retot.userinterface.RegisterUtestPage;
import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String namePage = Text.of(RegisterUtestPage.FINAL_PAGE).viewedBy(actor).asString();
        if(question.equals(namePage)){
            result =true;
        }else{
            result=false;
        }
        return result;
    }
}
