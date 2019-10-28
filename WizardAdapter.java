public class WizardAdapter implements Warrior {
    private Wizard wizard;
    public WizardAdapter(Wizard w){
        this.wizard = w;
    }
    public void attack(){
        wizard.performSpell();
    }
    public void defend(){
        wizard.heal();
    }
}
