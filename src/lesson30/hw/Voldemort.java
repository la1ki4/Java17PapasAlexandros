package lesson30.hw;

public class Voldemort {
    private static final Voldemort INSTANCE = new Voldemort();
    private final String MAGIC_SPELL;
    private final Boolean IS_ALIFE;

    private Voldemort(){
        this.MAGIC_SPELL = "avadaKedavra";
        this.IS_ALIFE = true;
    }

    public static Voldemort getInstance(){
        return INSTANCE;
    }

    public String avadaKedavra(){
        return this.MAGIC_SPELL;
    }

    public Boolean isAlife(){
        return this.IS_ALIFE;
    }
}
