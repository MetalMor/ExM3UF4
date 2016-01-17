package herencia;

/**
 * 081015
 * @author mor
 */
public class Manager extends Empleat {
    
    private String deptNom;
    private double bonus;

    public Manager(String aNom, double aSal, String deptNom, double bonus) {
        super(aNom, aSal);
        this.deptNom = deptNom;
        this.bonus = bonus;
    }
    
    public Manager() {
        super();
        this.deptNom = "any";
        this.bonus = 0;
    }

    public String getDeptNom() {
        return deptNom;
    }

    public double getBonus() {
        return bonus;
    }
    
    public double getSal() {
        return super.getSal();
    }
    
    public String getNom() {
        return super.getNom();
    }

    public void setNom(String nom) {
        super.setNom(nom);
    }
    
    public void setSal(double sal) {
        super.setSal(sal);
    }
    
    public void setDeptNom(String deptNom) {
        this.deptNom = deptNom;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public String toString() {
        return tipusEmpleat()+" amb nom "+this.getNom()+", salari "+this.getSal()+", "+this.getBonus()+" de bonus i del departament "+this.getDeptNom()+"."; //esto rula cuando intentas meter un objeto de la clase Empleat en un System.out.println()
    }
    
}
