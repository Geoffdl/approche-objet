package fr.diginamic.recensement;

public class Ville
{
    private int codeRegion;
    private String region;
    private String codeDepartement;
    private int codeCommune;
    private String communeNom;
    private int populationTotal;

    public Ville(int codeRegion, String region, String codeDepartement, int codeCommune, String communeNom, int populationTotal)
    {
        this.codeRegion = codeRegion;
        this.region = region;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.communeNom = communeNom;
        this.populationTotal = populationTotal;
    }

    public int getCodeRegion()
    {
        return codeRegion;
    }

    public void setCodeRegion(int codeRegion)
    {
        this.codeRegion = codeRegion;
    }

    public String getRegion()
    {
        return region;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }

    public String getCodeDepartement()
    {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement)
    {
        this.codeDepartement = codeDepartement;
    }

    public int getCodeCommune()
    {
        return codeCommune;
    }

    public void setCodeCommune(int codeCommune)
    {
        this.codeCommune = codeCommune;
    }

    public String getCommuneNom()
    {
        return communeNom;
    }

    public void setCommuneNom(String communeNom)
    {
        this.communeNom = communeNom;
    }

    public int getPopulationTotal()
    {
        return populationTotal;
    }

    public void setPopulationTotal(int populationTotal)
    {
        this.populationTotal = populationTotal;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Ville{");
        sb.append("regionCode=").append(codeRegion);
        sb.append(", region='").append(region).append('\'');
        sb.append(", dptCode='").append(codeDepartement).append('\'');
        sb.append(", communeCode=").append(codeCommune);
        sb.append(", communeName='").append(communeNom).append('\'');
        sb.append(", populationTotal=").append(populationTotal);
        sb.append('}');
        sb.append('\n');
        return sb.toString();
    }
}