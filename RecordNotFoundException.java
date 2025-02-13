package Crud.Springboot.demo.Exception;

public class RecordNotFoundException  extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public RecordNotFoundException()
	{
		
	}
	
	
	public RecordNotFoundException(String message)
	{
		super(message);
	}
}
