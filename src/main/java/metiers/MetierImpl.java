package metiers;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;//Couplage faible
    @Override
    public double calcule() {
        double tmp= dao.getData();
        System.out.println("version de la bd");
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    /* injecter dans la variable
     dao un objet  d'une classe qui implemente l'interfzce IDao */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
