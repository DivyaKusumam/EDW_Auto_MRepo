package EDW.Edward;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class randtests extends BaseClass
{

	BaseClass bc = new BaseClass();
	
	@Before
	public void openConn()
	{
		bc.connOpen();
	}
	
	@Test
	public void jobStatus() throws SQLException, Exception
	{
		ArrayList <String> ct = new ArrayList <String>();
		ct = bc.coreTablesForAStreamUsingAuditLogs(55);
		int len = ct.size();
		System.out.println(len);
		for (int i=0; i<ct.size(); i++)
		{
			bc.findCbkForaTableInCore(ct.get(i));
		}
		bc.coreTablesForAStreamusingStage(55);
	}
	
	
	@After
	public void closeConn() throws SQLException, Exception
	{
		bc.connClose();
	}
	
	
}