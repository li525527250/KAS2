package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import cn.com.broad.entity.KpiIndexModule;
import cn.com.broad.excel.InsertExcel;
import cn.com.broad.excel.LeadingOut;
import cn.com.broad.impl.KpiIndexModuleDaoImp;

public class TestExcel {
	 public static void main(String[] args) throws FileNotFoundException, IOException {  
	        KpiIndexModuleDaoImp kpiIndexModuleDaoImp=new KpiIndexModuleDaoImp();
	        List<KpiIndexModule> list=kpiIndexModuleDaoImp.getKpiIndexModule();
	        System.out.println(list);
	        LeadingOut.createExcel(list,"");
	    } 
}
