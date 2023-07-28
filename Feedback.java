/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback.dto;

/**
 *
 * @author nagar
 */
public class Feedback {
     private int feedbackId;
     private String customerName;
     private String feedback;

    public Feedback() {
    }

    public Feedback(int feedbackId, String customerName, String feedback) {
        this.feedbackId = feedbackId;
        this.customerName = customerName;
        this.feedback = feedback;
    }

    public Feedback(String customerName, String feedback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    
}
