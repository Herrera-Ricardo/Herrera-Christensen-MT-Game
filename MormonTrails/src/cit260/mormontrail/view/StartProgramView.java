/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.mormontrail.view;

/**
 *
 * @author rherrerajr
 */
public class StartProgramView {
    public StartProgramView(){
        
        boolean endOfView = false;
        do{
            String[] inputs = this.getInputs();
                    if (inputs == null || inputs.length < 1){
                        return;
                    }
                    endOfView = doAction(inputs);
        }
        while (endOfView != true);
    }

    private String[] getInputs() {
        System.out.println("*** getInputs() called ***");
        
        String[] inputs = new String[1];
        inputs[0] = "testInput";
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("*** doAction() called ***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }
}
// displayStartProgramView() {
//  endOfView = false
//  DO
// inputs = getInputs()
// IF no inputs were entered OR the first input is Q
//  RETURN
// ENDIF
// endOfView = doAction(inputs)
// WHILE endOfView != true
// }