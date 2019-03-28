package software.xdev;

import org.apache.meecrowave.Meecrowave;


public class BasicTestUIRunner
{
	private BasicTestUIRunner()
	{
	}
	
	public static void main(final String[] args)
	{
		new Meecrowave(new Meecrowave.Builder()
		{
			{
				// randomHttpPort();
				this.setHttpPort(8080);
				this.setTomcatScanning(true);
				this.setTomcatAutoSetup(false);
				this.setHttp2(true);
			}
		}).bake().await();
	}
}
