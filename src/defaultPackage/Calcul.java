package defaultPackage;

import java.text.DecimalFormat;

public abstract class Calcul {

	//step from 1 to3
	private static int step = 0;
	private static double numberA;
	private static String constructNumbA = "";
	private static double numberB;
	private static String constructNumbB = "";
	private static String operation;
	
	public static void calcul(String label, String value, String origine){

		if(Calcul.step == 0){
			if(origine.equals("numbers")){
				
				printOperation();
				
				if(value.equals(".")){
					constructNumbA = "0.";
				}
				else{
				constructNumbA = value;
				}
				
				step++;
				printOperation();
		}
		}
		
		else if(Calcul.step == 1){
			if(origine.equals("operatorsSub")){
				
				operation = value;
				
				step++;
				printOperation();
				
			}
			
			if(origine.equals("numbers")){
				constructNumbA = updateNumber(value,constructNumbA);
				printOperation();
			}
			
		}
		
		else if(Calcul.step == 2){
			if(origine.equals("numbers")){
				
				if(constructNumbB.equals("")){
					if(value.equals(".")){
						constructNumbB = "0.";
					}
					else{
					constructNumbB = value;
					}
				}
				else{
					constructNumbB = updateNumber(value,constructNumbB);
				}
				
				step++;
				printOperation();
				
			}	
		}
		
		else if(Calcul.step == 3){
			if(origine.equals("numbers")){
				constructNumbB = updateNumber(value,Calcul.constructNumbB);
				printOperation();
			}
			else if(origine.equals("operatorsSub2")){
				calculFinal();
				//Reset
				step = 0;
				constructNumbA = "";
				constructNumbB = "";
			}
		}
	}
	
	public static void calculFinal(){
		
		double finalResult;
		
		numberA = Double.valueOf(constructNumbA);
		numberB = Double.valueOf(constructNumbB);
						
				switch(operation){
				
				case "multiplicate":
					
					finalResult = numberA * numberB;
					
					break;
					
				case "add":
					
					finalResult = numberA + numberB;
					
					break;
					
				case "sub":
	
					finalResult = numberA - numberB;
					
					break;
	
				case "divide":
					
					try{finalResult = numberA / numberB;}catch(Exception e){
						
						finalResult = 0;
					}
	
					break;
					
				default:
					
					finalResult = 0;
				
				break;
				
				}

				DecimalFormat df = new DecimalFormat("########.###");
				if(String.valueOf(finalResult).length()>12){
				
					df = new DecimalFormat("0000000000.##E0");
					
				}				
					
				
		((JPanelResult)((Fenetre)Calculatrice.getFenetre()).getResult()).displayResult(df.format(finalResult));
		
	}
	
	private static String updateNumber(String value, String number){
		
		if((value.equals(".") && !number.contains(".")) || !value.equals(".")){
			number += value;
		}
		
		return number;
		
	}
	
	private static void printOperation(){
		
		switch(step){
		
			case 0:
				((JPanelResult)((Fenetre)Calculatrice.getFenetre()).getResult()).getLabelResult().setText("");
			break;
			
			case 1: 
				
				((JPanelResult)((Fenetre)Calculatrice.getFenetre()).getResult()).getOperation().setText(constructNumbA);
			
			break;
		
			case 2: 
				
				((JPanelResult)((Fenetre)Calculatrice.getFenetre()).getResult()).getOperation().setText(String.valueOf(constructNumbA)+" "+Operation.valueOf(operation.toUpperCase()).getValue());
			
			break;
			
			case 3:
				((JPanelResult)((Fenetre)Calculatrice.getFenetre()).getResult()).getOperation().setText(String.valueOf(constructNumbA)+" "+Operation.valueOf(operation.toUpperCase()).getValue() + " " + String.valueOf(constructNumbB)); 

			break;
		
		}
		
		
		
		
	}
	
	public static void reset(){
		
		((JPanelResult)((Fenetre)Calculatrice.getFenetre()).getResult()).getLabelResult().setText("");
		((JPanelResult)((Fenetre)Calculatrice.getFenetre()).getResult()).getOperation().setText("");
		step = 0;

		
	}
	
}
