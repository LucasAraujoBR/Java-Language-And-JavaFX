package parteFuncionario;


import java.util.ArrayList;
import java.util.Collections;



public class FuncionarioCadastro {
    private ArrayList<Funcionario> funcionarios;
    
    
    public FuncionarioCadastro() {
    	this.funcionarios = new ArrayList<>();
    	
    }
    
    public void cadrastarFuncionario(Funcionario p) {
    	if(p != null) {
   		 boolean mesaNExiste = true;
   		 
   		 for(Funcionario todas :funcionarios) {
   			 if(todas.equals(p)) {
   				  mesaNExiste = false;
   			 }
   		 }
   		 if(mesaNExiste) {
   			 this.funcionarios.add(p);
   		 }
   	 }
    	
    	
    }
    

   
   public ArrayList<Funcionario> listarFuncionario(){
	   return funcionarios;
   }
  
}