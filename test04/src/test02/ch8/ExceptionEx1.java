package test02.ch8;

class ExceptionEx1 {
	public static void main(String[] args) 
   {
		try  {
			try	{	} catch (Exception e)	{ }
		} catch (Exception e)	{
			try	{	} catch (Exception e) { }	// ����. ���� e�� �ߺ� ����Ǿ���.
		} // try-catch�� ��

		try  {

		} catch (Exception e)	{

		} // try-catch�� ��
	}	// main�޼����� ��
}
