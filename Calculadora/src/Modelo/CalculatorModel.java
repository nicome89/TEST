package Modelo;

	public class CalculatorModel {

	     
	    private int calculationValueSuma;
	    private int calculationValueResta;
	    private int calculationValueMult;
	    private int calculationValueDiv;
	     
	    public void addTwoNumbers(int firstNumber, int secondNumber){
	         
	        calculationValueSuma = firstNumber + secondNumber;
         
	    }
	    
	    public void SubTwoNumbers(int firstNumber, int secondNumber){
	         
	        calculationValueResta = firstNumber - secondNumber;
         
	    }
	    
	    public void MultTwoNumbers(int firstNumber, int secondNumber){
	         
	        calculationValueMult = firstNumber * secondNumber;
         
	    }
	    
	    public void DivTwoNumbers(int firstNumber, int secondNumber){
	         
	    	
	        calculationValueDiv = firstNumber / secondNumber;
         
	    }
	    
	     
	    public int getCalculationValueSuma(){
	         
	        return calculationValueSuma;
	         
	    }
	    public int getCalculationValueResta(){
	         
	        return calculationValueResta;
	         
	    }
	    
	    public int getCalculationValueMult(){
	         
	        return calculationValueMult;
	         
	    }
	    
	    public int getCalculationValueDiv(){
	         
	        return calculationValueDiv;
	         
	    }
	     }
