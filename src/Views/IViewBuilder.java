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
interface IViewBuilder {
    
    
    public void initializeGeneralForm();
    public void initializePersonalizeForm();
    public void addComponents();
    public void componentsPosition();
    public void addEvents();
    public void launchView();
    
}
