package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.CalculatorModel;
import Vista.CalculatorView;
	 

	 
	public class CalculatorController {
	     
	    private CalculatorView theView;
	    private CalculatorModel theModel;
	     
	    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
	        this.theView = theView;
	        this.theModel = theModel;
	         
	        // Tell the View that when ever the calculate button
	        // is clicked to execute the actionPerformed method
	        // in the CalculateListener inner class
	         
	        this.theView.addCalculateListener(new CalculateListenerSuma());
	        this.theView.SubCalculateListener(new CalculateListenerResta());
	        this.theView.MultCalculateListener(new CalculateListenerMult());
	        this.theView.DivCalculateListener(new CalculateListenerDiv());
	       
	    }
	     
	    class CalculateListenerSuma implements ActionListener{
	 
	        public void actionPerformed(ActionEvent e) {
	             
	            int firstNumberSuma, secondNumberSuma = 0;
	            
	            
	            // Surround interactions with the view with
	            // a try block in case numbers weren't
	            // properly entered
	             
	            try{
	             
	                firstNumberSuma = theView.getFirstNumberSuma();
	                secondNumberSuma = theView.getSecondNumberSuma();
	                 
	                theModel.addTwoNumbers(firstNumberSuma, secondNumberSuma);
	                 
	                theView.setCalcSolutionSuma(theModel.getCalculationValueSuma());
	                
	                
	             
	            }
 
	            catch(NumberFormatException ex){
	                 
                System.out.println(ex);
	                 
	                theView.displayErrorMessage("HAY UN CAMPO SOLO O UN CAMPO NO ES UN NUMERO ENTERO");
	                 
	            }
	             
	        }

	        
	        }
	    
	    class CalculateListenerResta implements ActionListener{
	       	 
	        public void actionPerformed(ActionEvent e) {
	             
	            int firstNumberResta, secondNumberResta = 0;
	            
	            
	            // Surround interactions with the view with
	            // a try block in case numbers weren't
	            // properly entered
	             
	            try{
	             
	                firstNumberResta = theView.getFirstNumberResta();
	                secondNumberResta = theView.getSecondNumberResta();
	                 
	                theModel.SubTwoNumbers(firstNumberResta, secondNumberResta);
	                 
	                theView.setCalcSolutionResta(theModel.getCalculationValueResta());
	                
	                
	             
	            }
 
	            catch(NumberFormatException ex){
	                 
                System.out.println(ex);
	                 
	                theView.displayErrorMessage("HAY UN CAMPO SOLO O UN CAMPO NO ES UN NUMERO ENTERO");
	                 
	            }
	             
	        }
	    }
	    
	    class CalculateListenerMult implements ActionListener{
	   	 
	        public void actionPerformed(ActionEvent e) {
	             
	            int firstNumberMult, secondNumberMult = 0;
	            
	            
	            // Surround interactions with the view with
	            // a try block in case numbers weren't
	            // properly entered
	             
	            try{
	             
	                firstNumberMult = theView.getFirstNumberMult();
	                secondNumberMult = theView.getSecondNumberMult();
	                 
	                theModel.MultTwoNumbers(firstNumberMult, secondNumberMult);
	                 
	                theView.setCalcSolutionMult(theModel.getCalculationValueMult());
	                
	                
	             
	            }
 
	            catch(NumberFormatException ex){
	                 
                System.out.println(ex);
	                 
	                theView.displayErrorMessage("HAY UN CAMPO SOLO O UN CAMPO NO ES UN NUMERO ENTERO");
	                 
	            }
	             
	        }

	        
	        }
	    
	    class CalculateListenerDiv implements ActionListener{
	   	 
	        public void actionPerformed(ActionEvent e) {
	             
	            int firstNumberDiv, secondNumberDiv = 0;
	            
	            
	            // Surround interactions with the view with
	            // a try block in case numbers weren't
	            // properly entered
	             
	            try{
	             
	                firstNumberDiv = theView.getFirstNumberDiv();
	                secondNumberDiv = theView.getSecondNumberDiv();
	                 
	                theModel.DivTwoNumbers(firstNumberDiv, secondNumberDiv);
	                 
	                theView.setCalcSolutionDiv(theModel.getCalculationValueDiv());
	                
	                
	             
	            }
 
	            catch(NumberFormatException ex  ){
	                 
                System.out.println(ex);
	                 
	                theView.displayErrorMessage("HAY UN CAMPO SOLO O UN CAMPO NO ES UN NUMERO ENTERO");
	                
	            }
	            
	        
	            catch (ArithmeticException ex) { 
	    	        		   	        		 
	            	 System.out.println(ex);
	                 
		                theView.displayErrorMessage(" No se puede dividir por 0 ");
	      	             	           	            
	            }
	            
	        
	             
	        }

	        
	        }
	
	}
