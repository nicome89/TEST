package Vista;

	 
	import java.awt.Rectangle;
import java.awt.event.ActionListener;
	 
import javax.swing.*;
	 
	public class CalculatorView extends JFrame{
	 
	    private JTextField firstNumberSuma  = new JTextField(10);
	    private JTextField firstNumberResta  = new JTextField();
	    private JTextField firstNumberMult  = new JTextField();
	    private JTextField firstNumberDiv  = new JTextField();
	    
	    private JLabel additionLabel1 = new JLabel("+");
	    private JLabel additionLabel2 = new JLabel("-");
	    private JLabel additionLabel3 = new JLabel("*");
	    private JLabel additionLabel4 = new JLabel("/");
	    
	    private JTextField secondNumberSuma = new JTextField(10);
	    private JTextField secondNumberResta = new JTextField();
	    private JTextField secondNumberMult = new JTextField();
	    private JTextField secondNumberDiv = new JTextField();
	    
	    private JButton calculateButtonSuma = new JButton("Calcular");
	    private JButton calculateButtonResta = new JButton("Calcular");
	    private JButton calculateButtonMult = new JButton("Calcular");
	    private JButton calculateButtonDiv = new JButton("Calcular");
	    
	    private JTextField calcSolutionSuma = new JTextField(10); 
	    private JTextField calcSolutionResta = new JTextField(); 
	    private JTextField calcSolutionMult = new JTextField(); 
	    private JTextField calcSolutionDiv = new JTextField(); 
	    
	    public CalculatorView(){
	         
	        // Sets up the view and adds the components
	         
	        JPanel calcPanel = new JPanel();
	       
	        
	        this.setTitle("---- CALCULADORA ----");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(600, 180);
	        
	        /*suma*/
	    	       	        
		    calcPanel.add(firstNumberSuma);
	        calcPanel.add(additionLabel1);
	        calcPanel.add(secondNumberSuma);
	        calcPanel.add(calculateButtonSuma);
	        calcPanel.add(calcSolutionSuma);
	        
	        /*resta*/
	        firstNumberResta.setBounds(67,40,115,20);
	        add(firstNumberResta);
	        
	        secondNumberResta.setBounds(197,40,115,20);
	        add(secondNumberResta);
	        
	        additionLabel2.setBounds(187,40,115,20);
	        add(additionLabel2);
	        
	        calculateButtonResta.setBounds(317,40,81,25);
	        add(calculateButtonResta);
	        
	        calcSolutionResta.setBounds(403,40,115,20);
	        add(calcSolutionResta);
	        
	        
	        /*multiplicacion*/
	        
	        firstNumberMult.setBounds(67,70,115,20);
	        add(firstNumberMult);
	        
	        secondNumberMult.setBounds(197,70,115,20);
	        add(secondNumberMult);
	        
	        additionLabel3.setBounds(187,70,115,20);
	        add(additionLabel3);
	        
	        calculateButtonMult.setBounds(317,70,81,25);
	        add(calculateButtonMult);
	        
	        calcSolutionMult.setBounds(403,70,115,20);
	        add(calcSolutionMult);
	        
	        /*division*/
	        
	        firstNumberDiv.setBounds(67,100,115,20);
	        add(firstNumberDiv);
	        
	        secondNumberDiv.setBounds(197,100,115,20);
	        add(secondNumberDiv);
	        
	        additionLabel4.setBounds(187,100,115,20);
	        add(additionLabel4);
	        
	        calculateButtonDiv.setBounds(317,100,81,25);
	        add(calculateButtonDiv);
	        
	        calcSolutionDiv.setBounds(403,100,115,20);
	        add(calcSolutionDiv);
	        
	        
	       
	        this.add(calcPanel);
	         
	        // End of setting up the components --------
	         
	    }
	     
	    public int getFirstNumberResta(){
         
	        return Integer.parseInt(firstNumberResta.getText());
	         
	    }
	     
	    public int getSecondNumberResta(){
	         
	        return Integer.parseInt(secondNumberResta.getText());
	         
	    }
	     
	    public int getCalcSolutionResta(){
	         
	        return Integer.parseInt(calcSolutionResta.getText());
	         
	    }
	     
	    public void setCalcSolutionResta(int solution){
	         
	        calcSolutionResta.setText(Integer.toString(solution));
	         
	    }
	    
	    public int getFirstNumberSuma(){
	         
	        return Integer.parseInt(firstNumberSuma.getText());
	         
	    }
	     
	    public int getSecondNumberSuma(){
	         
	        return Integer.parseInt(secondNumberSuma.getText());
	         
	    }
	     
	    public int getCalcSolutionSuma(){
	         
	        return Integer.parseInt(calcSolutionSuma.getText());
	         
	    }
	     
	    public void setCalcSolutionSuma(int solution){
	         
	        calcSolutionSuma.setText(Integer.toString(solution));
	         
	    }
	    
	    
	    
	    public int getFirstNumberMult(){
	         
	        return Integer.parseInt(firstNumberMult.getText());
	         
	    }
	     
	    public int getSecondNumberMult(){
	         
	        return Integer.parseInt(secondNumberMult.getText());
	         
	    }
	     
	    public int getCalcSolutionMult(){
	         
	        return Integer.parseInt(calcSolutionMult.getText());
	         
	    }
	     
	    public void setCalcSolutionMult(int solution){
	         
	        calcSolutionMult.setText(Integer.toString(solution));
	         
	    }
	    
	    public int getFirstNumberDiv(){
	         
	        return Integer.parseInt(firstNumberDiv.getText());
	         
	    }
	     
	    public int getSecondNumberDiv(){
	         
	        return Integer.parseInt(secondNumberDiv.getText());
	         
	    }
	     
	    public int getCalcSolutionDiv(){
	         
	        return Integer.parseInt(calcSolutionDiv.getText());
	         
	    }
	     
	    public void setCalcSolutionDiv(int solution){
	         
	        calcSolutionDiv.setText(Integer.toString(solution));
	         
	    }
	     
	    // If the calculateButton is clicked execute a method
	    // in the Controller named actionPerformed
	     
	    public void addCalculateListener(ActionListener listenForCalcButton){
	         
	        calculateButtonSuma.addActionListener(listenForCalcButton);
	         
	    }
	    
	    
	    public void SubCalculateListener(ActionListener listenForCalcButtonResta){
	         
	        calculateButtonResta.addActionListener(listenForCalcButtonResta);
	         
	    }
	    
	    public void MultCalculateListener(ActionListener listenForCalcButtonMult){
	         
	        calculateButtonMult.addActionListener(listenForCalcButtonMult);
	         
	    }
	    
	    public void DivCalculateListener(ActionListener listenForCalcButtonDiv){
	         
	        calculateButtonDiv.addActionListener(listenForCalcButtonDiv);
	         
	    }
	     
	     
	    // Open a popup that contains the error message passed
	     
	    public void displayErrorMessage(String errorMessage){
	         
	        JOptionPane.showMessageDialog(this, errorMessage);
	         
	    }
	    	   
	  
	   
	}
