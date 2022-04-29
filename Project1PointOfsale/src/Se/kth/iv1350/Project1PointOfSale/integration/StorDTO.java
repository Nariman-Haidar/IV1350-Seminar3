package Se.kth.iv1350.Project1PointOfSale.integration;

/**
 * This class to handle all information about the store.
 */
public class StorDTO {
    private  String name;

    /**
     * Creat a new instance of stor DTO.
     * @param name
     */
    public StorDTO(String name){
        this.name = name;
    }

    public StorDTO() {

    }

    /**
     * this method to get the store name.
     * @return the store name.
     */
    public String getName(){
        return this.name;
    }
}
