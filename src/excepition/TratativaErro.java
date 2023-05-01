package excepition;

public class TratativaErro extends Throwable {

    //todo PAI das exceçoes "Throwable"
    //todo dentro do TRY fica o codigo e no CATCH fica a exception


    private String tratativaException;

    public TratativaErro() {
    }

    public TratativaErro(String tratativaException) {
        this.tratativaException = tratativaException;
    }

    public String getMotivoDaException(){
        return tratativaException;
    }

}
