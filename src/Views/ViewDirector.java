/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Santiago
 */
class ViewDirector {

    private IViewBuilder myBuilder;

    public ViewDirector(IViewBuilder builder) {
        myBuilder = builder;
    }
    
    public void launchView(){
        myBuilder.launchView();                
    }

}
