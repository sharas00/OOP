public class Plant {
    private String title;
    private String latinName;
    private boolean year;
    private String theContinent;
    private double plantHeightInMeters;
    private boolean eatable;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public boolean isYear() {
        return year;
    }

    public void setYear(boolean year) {
        this.year = year;
    }

    public String getTheContinent() {
        return theContinent;
    }

    public void setTheContinent(String theContinent) {
        this.theContinent = theContinent;
    }

    public double getPlantHeightInMeters() {
        return plantHeightInMeters;
    }

    public void setPlantHeightInMeters(double plantHeightInMeters) {
        this.plantHeightInMeters = plantHeightInMeters;
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }



    public Plant(){
    }

    public Plant(String title, String latinName, boolean year, String theContinent, double plantHeightInMeters, boolean eatable) {
        this.title = title;
        this.latinName = latinName;
        this.year = year;
        this.theContinent = theContinent;
        this.plantHeightInMeters = plantHeightInMeters;
        this.eatable = eatable;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "title='" + title + '\'' +
                ", latinName='" + latinName + '\'' +
                ", year=" + year +
                ", theContinent='" + theContinent + '\'' +
                ", plantHeightInMeters=" + plantHeightInMeters +
                ", eatable=" + eatable +
                '}';
    }
}
