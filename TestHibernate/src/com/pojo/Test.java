package com.pojo;

import java.util.List;
import java.util.Set;

public class Test
{
	public static void main(String[] args)
	{
		SjzdflDAO sDao = new SjzdflDAO();
		List<Sjzdfl> ses = sDao.findAll();
		for (Sjzdfl sjzdfl : ses)
		{
			System.out.println(sjzdfl.getSjzdflId());
			System.out.println(sjzdfl.getSjzdflmc());
			Set<Sjzdxx> sjzdxxes = sjzdfl.getSjzdxxes();
			for (Sjzdxx sjzdxx : sjzdxxes)
			{
				System.out.print(sjzdxx.getSjzzxxmc()+",");
			}
			System.out.println();
			System.out.println("========================");
		}
    }
}
