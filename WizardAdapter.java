public class WizardAdapter implements Warrior { //class gets methods from Warrior class
    private Wizard wizard;
    //constructor has parameter of wizard using warrior commands
    public WizardAdapter(Wizard w){
        this.wizard = w;
    }
    //warrior commands that make wizard use wizard commands
    public void attack(){
        wizard.performSpell();
    }
    public void defend(){
        wizard.heal();
    }
}
