package application;


import java.awt.Point;
import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;

public class SampleController {
	
	private static byte incremento=1;
	private static byte decremento=-1;
	
	private static byte incrementoX=1;
	private static byte incrementoY=1;
	
	AnimationTimer timer1;
	  @FXML
	    private Circle pelota ;
	  @FXML
	    private Circle pelota2 ;
	  
	  @FXML
	    private Circle pelota3 ;
	 
	  @FXML
	    private Circle pelota4 ;
	  @FXML
	    private Button play ;
	  
	  @FXML
	    private Label winner1 ;
	
	  @FXML
		public void ActionEventPlay(ActionEvent event) {
		  System.out.println("Hola");
	    }
	 
	  @FXML
	    void iniciar(ActionEvent event) {
		  System.out.println("Funciona :D");
		  Random ramdom = new Random();
	    	 timer1 = new AnimationTimer() {
	    		@Override
	        	public void handle(long now) {
	    			
	    			int random1 = (int)(ramdom.nextInt(3)+1);
	    			int random2 = (int)(ramdom.nextInt(3)+1);
	    			int random3 = (int)(ramdom.nextInt(3)+1);
	    			int random4 = (int)(ramdom.nextInt(3)+1);
	    			
	        		
	        		pelota.setLayoutX(pelota.getLayoutX()+random1);
	        		if (pelota.getLayoutX() == 450 ) {
	        			timer1.stop();
	        			winner1.setText("Ganador 1");
	        			
	    				
	        		}
	        		
	        		//pelota 2
	        		
	        		pelota2.setLayoutX(pelota2.getLayoutX()+random2);
	        		if (pelota2.getLayoutX() == 450 ) {
	        			timer1.stop();
	        			winner1.setText("Ganador 2");
	        		}
	        		
	        		
	        		pelota4.setLayoutX(pelota4.getLayoutX()+random4);
	        		if (pelota4.getLayoutX() == 450 ) {
	        			timer1.stop();
	        			winner1.setText("Ganador 3");
	        		}
	        		
	        		
	        		
	        	//	pelota.setLayoutY(pelota.getLayoutY()+decremento);
	        		//if(pelota.getLayoutY() == 240 || pelota.getLayoutY()==10) {
	        			//decremento *= -1;
	        		//}
	        		
	        	}
	        };
	        timer1.start();
	     
	       
}
}
