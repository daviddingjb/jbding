package com.trusdata.integrate.report.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author JBDING
 * 
 */
public class SetInsertBean {

	public static ReportInsertBean setBean(ReportTbaseBean server,
			ReportStatus1Bean server1, ReportStatus2Bean server2,
			ReportStatus3Bean server3) throws Exception {
		ReportInsertBean insert = new ReportInsertBean();

		int scope = 0;
		int flg1 = 0;
		int flg2 = 0;
		if (!"".equals(server.getYear1()) && server.getYear1() != null) {
			insert.setYear1(server.getYear1());
		} else {
			insert.setYear1("");
		}

		if (!"".equals(server.getCounty()) && server.getCounty() != null) {
			insert.setCounty(server.getCounty());
		} else {
			insert.setCounty("");
		}

		if (!"".equals(server.getTownship()) && server.getTownship() != null) {
			insert.setTownship(server.getTownship());
		} else {
			insert.setTownship("");
		}

		if (!"".equals(server.getVillage()) && server.getVillage() != null) {
			insert.setVillage(server.getVillage());
		} else {
			insert.setVillage("");
		}

		if (!"".equals(server.getGroup1()) && server.getGroup1() != null) {
			insert.setGroup1(server.getGroup1());
		} else {
			insert.setGroup1("");
		}

		if (!"".equals(server.getName1()) && server.getName1() != null) {
			insert.setName1(server.getName1());
		} else {
			insert.setName1("");
		}

		if (!"".equals(server.getFamily_size()) && server.getFamily_size() != null) {
			insert.setFamily_size(strToInt(server.getFamily_size()));
		} else {
			insert.setFamily_size(0);
		}

		if (!"".equals(server.getWorkers_size()) && server.getWorkers_size() != null) {
			insert.setWorkers_size(strToInt(server.getWorkers_size()));
		} else {
			insert.setWorkers_size(0);
		}

		if (!"".equals(server.getDibao_size()) && server.getDibao_size() != null) {
			insert.setDibao_size(strToInt(server.getDibao_size()));
		} else {
			insert.setDibao_size(0);
		}

		if (!"".equals(server.getWudao_size()) && server.getWudao_size() != null) {
			insert.setWudao_size(strToInt(server.getWudao_size()));
		} else {
			insert.setWudao_size(0);
		}

		if (server.getPoverty_level1() != null) {
			insert.setPoverty_level1(1);
		} else {
			insert.setPoverty_level1(0);
		}

		if (server.getPoverty_level2() != null) {
			insert.setPoverty_level2(1);
		} else {
			insert.setPoverty_level2(0);
		}

		if (server.getPoverty_level3() != null) {
			insert.setPoverty_level3(1);
		} else {
			insert.setPoverty_level3(0);
		}

		if (server.getPoverty_level4() != null) {
			insert.setPoverty_level4(1);
		} else {
			insert.setPoverty_level4(0);
		}

		if (!"".equals(server3.getSign1()) && server3.getSign1() != null) {
			insert.setSign1(server3.getSign1());
		} else {
			insert.setSign1("");
		}

		if (!"".equals(server.getSign_date()) && server.getSign_date() != null) {
			insert.setSign_date(strToDate(server.getSign_date()));
		} else {
			insert.setSign_date(new Date());
		}

		if (server1.getIndustry1() != null) {
			insert.setIndustry1(1);
			flg1 += 1;
		} else {
			insert.setIndustry1(0);
		}

		if (server1.getIndustry2() != null) {
			insert.setIndustry2(1);
			flg1 += 1;
		} else {
			insert.setIndustry2(0);
		}

		if (server1.getIndustry3() != null) {
			insert.setIndustry3(1);
			flg1 += 1;
		} else {
			insert.setIndustry3(0);
		}

		if (server1.getIndustry4() != null) {
			insert.setIndustry4(1);
			flg1 += 1;
		} else {
			insert.setIndustry4(0);
		}

		if (server1.getIndustry5() != null) {
			insert.setIndustry5(1);
			flg1 += 1;
		} else {
			insert.setIndustry5(0);
		}

		if (server1.getIndustry6() != null) {
			insert.setIndustry6(1);
			flg1 += 1;
		} else {
			insert.setIndustry6(0);
		}

		if (server1.getIndustry7() != null) {
			insert.setIndustry7(1);
			flg1 += 1;
		} else {
			insert.setIndustry7(0);
		}

		if (!"".equals(server1.getContent7()) && server1.getContent7() != null) {
			insert.setContent7(server1.getContent7());
		} else {
			insert.setContent7("");
		}

		if (server1.getIndustry8() != null) {
			insert.setIndustry8(1);
		} else {
			insert.setIndustry8(0);
		}

		if (!"".equals(server1.getScope11()) && server1.getScope11() != null) {
			insert.setScope11(strToInt(server1.getScope11()));
		} else {
			insert.setScope11(0);
		}

		if (!"".equals(server1.getScope12()) && server1.getScope12() != null) {
			insert.setScope12(strToInt(server1.getScope12()));
			scope += insert.getScope12();
		} else {
			if ((insert.getWorkers_size() > 0 && flg1 > 0) || insert.getWorkers_size() == 0) {
				insert.setScope12(10);
				scope += 10;
			} else {
				insert.setScope12(0);
			}
		}

		if (server1.getSkill1() != null) {
			insert.setSkill1(1);
			flg2 += 1;
		} else {
			insert.setSkill1(0);
		}

		if (server1.getSkill2() != null) {
			insert.setSkill2(1);
			flg2 += 1;
		} else {
			insert.setSkill2(0);
		}

		if (server1.getSkill3() != null) {
			insert.setSkill3(1);
			flg2 += 1;
		} else {
			insert.setSkill3(0);
		}

		if (server1.getSkill4() != null) {
			insert.setSkill4(1);
			flg2 += 1;
		} else {
			insert.setSkill4(0);
		}

		if (!"".equals(server1.getContent4()) && server1.getContent4() != null) {
			insert.setContent4(server1.getContent4());
		} else {
			insert.setContent4("");
		}

		if (server1.getSkill5() != null) {
			insert.setSkill5(1);
		} else {
			insert.setSkill5(0);
		}

		if (!"".equals(server1.getScope21()) && server1.getScope21() != null) {
			insert.setScope21(strToInt(server1.getScope21()));
		} else {
			insert.setScope21(0);
		}

		if (!"".equals(server1.getScope22()) && server1.getScope22() != null) {
			insert.setScope22(strToInt(server1.getScope22()));
			scope += insert.getScope22();
		} else {
			if ((insert.getWorkers_size() > 0 && flg2 > 0) || insert.getWorkers_size() == 0) {
				insert.setScope22(10);
				scope += 10;
			} else {
				insert.setScope22(0);
			}
		}

		if (!"".equals(server1.getScope31()) && server1.getScope31() != null) {
			insert.setScope31(strToInt(server1.getScope31()));
		} else {
			insert.setScope31(0);
		}

		if (!"".equals(server1.getScope32()) && server1.getScope32() != null) {
			insert.setScope32(strToInt(server1.getScope32()));
			scope += insert.getScope32();
		} else {
			if (server1.getCheck1y() != null) {
				insert.setScope32(20);
				scope += 20;
			} else {
				insert.setScope32(0);
			}
		}

		if (!"".equals(server1.getScope41()) && server1.getScope41() != null) {
			insert.setScope41(strToInt(server1.getScope41()));
		} else {
			insert.setScope41(0);
		}

		if (!"".equals(server1.getScope42()) && server1.getScope42() != null) {
			insert.setScope42(strToInt(server1.getScope42()));
			scope += insert.getScope42();
		} else {
			if (server1.getCheck2y() != null) {
				insert.setScope42(2);
				scope += 2;
			} else {
				insert.setScope42(0);
			}
		}

		if (!"".equals(server1.getScope51()) && server1.getScope51() != null) {
			insert.setScope51(strToInt(server1.getScope51()));
		} else {
			insert.setScope51(0);
		}

		if (!"".equals(server1.getScope52()) && server1.getScope52() != null) {
			insert.setScope52(strToInt(server1.getScope52()));
			scope += insert.getScope52();
		} else {
			if (server1.getCheck3y() != null || server1.getCheck3o() != null) {
				insert.setScope52(10);
				scope += 10;
			} else {
				insert.setScope52(0);
			}
		}

		if (!"".equals(server1.getScope61()) && server1.getScope61() != null) {
			insert.setScope61(strToInt(server1.getScope61()));
		} else {
			insert.setScope61(0);
		}

		if (!"".equals(server1.getScope62()) && server1.getScope62() != null) {
			insert.setScope62(strToInt(server1.getScope62()));
			scope += insert.getScope62();
		} else {
			if (server1.getCheck4y() != null) {
				insert.setScope62(8);
				scope += 8;
			} else {
				insert.setScope62(0);
			}
		}

		if (!"".equals(server1.getMoney1()) && server1.getMoney1() != null) {
			insert.setMoney1(strToDouble(server1.getMoney1()));
		} else {
			insert.setMoney1(0.0);
		}

		if (!"".equals(server1.getMoney2()) && server1.getMoney2() != null) {
			insert.setMoney2(strToDouble(server1.getMoney2()));
		} else {
			insert.setMoney2(0.0);
		}

		if (!"".equals(server1.getFupinbz()) && server1.getFupinbz() != null) {
			insert.setFupinbz(strToDouble(server1.getFupinbz()));
		} else {
			insert.setFupinbz(0.0);
		}

		if (server1.getCheck1y() != null) {
			insert.setCheck1y(1);
		} else {
			insert.setCheck1y(0);
		}

		if (server1.getCheck1n() != null) {
			insert.setCheck1n(1);
		} else {
			insert.setCheck1n(0);
		}

		if (server1.getCheck2y() != null) {
			insert.setCheck2y(1);
		} else {
			insert.setCheck2y(0);
		}

		if (server1.getCheck2n() != null) {
			insert.setCheck2n(1);
		} else {
			insert.setCheck2n(0);
		}

		if (server1.getCheck3y() != null) {
			insert.setCheck3y(1);
		} else {
			insert.setCheck3y(0);
		}

		if (server1.getCheck3n() != null) {
			insert.setCheck3n(1);
		} else {
			insert.setCheck3n(0);
		}

		if (server1.getCheck3o() != null) {
			insert.setCheck3o(1);
		} else {
			insert.setCheck3o(0);
		}

		if (server1.getCheck4y() != null) {
			insert.setCheck4y(1);
		} else {
			insert.setCheck4y(0);
		}

		if (server1.getCheck4n() != null) {
			insert.setCheck4n(1);
		} else {
			insert.setCheck4n(0);
		}

		if (!"".equals(server1.getRenjun()) && server1.getRenjun() != null) {
			insert.setRenjun(strToDouble(server1.getRenjun()));
		} else {
			insert.setRenjun(0.0);
		}

		if (!"".equals(server1.getIncome()) && server1.getIncome() != null) {
			insert.setIncome(strToDouble(server1.getIncome()));
		} else {
			insert.setIncome(0.0);
		}

		if (!"".equals(server1.getIncrease()) && server1.getIncrease() != null) {
			insert.setIncrease(strToDouble(server1.getIncrease()));
		} else {
			insert.setIncrease(0.0);
		}

		if (!"".equals(server1.getAve_increase()) && server1.getAve_increase() != null) {
			insert.setAve_increase(strToDouble(server1.getAve_increase()));
		} else {
			insert.setAve_increase(0.0);
		}

		if (server2.getEat_y() != null) {
			insert.setEat_y(1);
		} else {
			insert.setEat_y(0);
		}

		if (server2.getEat_n() != null) {
			insert.setEat_n(1);
		} else {
			insert.setEat_n(0);
		}

		if (!"".equals(server2.getScope72()) && server2.getScope72() != null) {
			insert.setScope72(strToInt(server2.getScope72()));
			scope += insert.getScope72();
		} else {
			insert.setScope72(0);
		}

		if (!"".equals(server2.getScope82()) && server2.getScope82() != null) {
			insert.setScope82(strToInt(server2.getScope82()));
			scope += insert.getScope82();
		} else {
			insert.setScope82(0);
		}

		if (server2.getWear_y() != null) {
			insert.setWear_y(1);
		} else {
			insert.setWear_y(0);
		}

		if (server2.getWear_n() != null) {
			insert.setWear_n(1);
		} else {
			insert.setWear_n(0);
		}

		if (server3.getHouse1() != null) {
			insert.setHouse1(1);
		} else {
			insert.setHouse1(0);
		}

		if (server3.getHouse2() != null) {
			insert.setHouse2(1);
		} else {
			insert.setHouse2(0);
		}

		if (!"".equals(server3.getScope91()) && server3.getScope91() != null) {
			insert.setScope91(strToInt(server3.getScope91()));
		} else {
			insert.setScope91(0);
		}

		if (!"".equals(server3.getScope92()) && server3.getScope92() != null) {
			insert.setScope92(strToInt(server3.getScope92()));
			scope += insert.getScope92();
		} else {
			if (server3.getHouse1() != null) {
				insert.setScope92(5);
				scope += 5;
			} else if (server3.getHouse2() != null) {
				insert.setScope92(0);
			} else {
				insert.setScope92(0);
			}
		}

		if (!"".equals(server3.getScope101()) && server3.getScope101() != null) {
			insert.setScope101(strToInt(server3.getScope101()));
		} else {
			insert.setScope101(0);
		}

		if (!"".equals(server3.getScope102()) && server3.getScope102() != null) {
			insert.setScope102(strToInt(server3.getScope102()));
			scope += insert.getScope102();
		} else {
			if (server3.getHouse_y() != null) {
				insert.setScope102(5);
				scope += 5;
			} else {
				insert.setScope102(0);
			}
		}

		if (!"".equals(server3.getScope111()) && server3.getScope111() != null) {
			insert.setScope111(strToInt(server3.getScope111()));
		} else {
			insert.setScope111(0);
		}

		if (!"".equals(server3.getScope112()) && server3.getScope112() != null) {
			insert.setScope112(strToInt(server3.getScope112()));
			scope += insert.getScope112();
		} else {
			if (server3.getWater1() != null) {
				insert.setScope112(5);
				scope += 5;
			} else if (server3.getWater2() != null) {
				insert.setScope112(4);
				scope += 4;
			} else {
				insert.setScope112(0);
			}
		}

		if (!"".equals(server3.getScope121()) && server3.getScope121() != null) {
			insert.setScope121(strToInt(server3.getScope121()));
		} else {
			insert.setScope121(0);
		}

		if (!"".equals(server3.getScope122()) && server3.getScope122() != null) {
			insert.setScope122(strToInt(server3.getScope122()));
			scope += insert.getScope122();
		} else {
			if (server3.getElectricity1() != null) {
				insert.setScope122(5);
				scope += 5;
			} else if (server3.getElectricity2() != null) {
				insert.setScope122(2);
				scope += 2;
			} else {
				insert.setScope122(0);
			}
		}

		if (!"".equals(server3.getScope131()) && server3.getScope131() != null) {
			insert.setScope131(strToInt(server3.getScope131()));
		} else {
			insert.setScope131(0);
		}

		if (!"".equals(server3.getScope132()) && server3.getScope132() != null) {
			insert.setScope132(strToInt(server3.getScope132()));
			scope += insert.getScope132();
		} else {
			if (server3.getTraffic1() != null) {
				insert.setScope132(2);
				scope += 2;
			} else if (server3.getTraffic2() != null) {
				insert.setScope132(1);
				scope += 1;
			} else {
				insert.setScope132(0);
			}
		}

		if (!"".equals(server3.getScope141()) && server3.getScope141() != null) {
			insert.setScope141(strToInt(server3.getScope141()));
		} else {
			insert.setScope141(0);
		}

		if (!"".equals(server3.getScope142()) && server3.getScope142() != null) {
			insert.setScope142(strToInt(server3.getScope142()));
			scope += insert.getScope142();
		} else {
			if (server3.getEducation2() != null) {
				insert.setScope142(5);
				scope += 5;
			}  else {
				insert.setScope142(0);
			}
		}

		if (!"".equals(server3.getScope151()) && server3.getScope151() != null) {
			insert.setScope151(strToInt(server3.getScope151()));
		} else {
			insert.setScope151(0);
		}

		if (!"".equals(server3.getScope152()) && server3.getScope152() != null) {
			insert.setScope152(strToInt(server3.getScope152()));
			scope += insert.getScope152();
		} else {
			if (server3.getMedical_treatment11() != null) {
				insert.setScope152(5);
				scope += 5;
			}  else {
				insert.setScope152(0);
			}
		}

		if (!"".equals(server3.getScope161()) && server3.getScope161() != null) {
			insert.setScope161(strToInt(server3.getScope161()));
		} else {
			insert.setScope161(0);
		}

		if (!"".equals(server3.getScope162()) && server3.getScope162() != null) {
			insert.setScope162(strToInt(server3.getScope162()));
			scope += insert.getScope162();
		} else {
			if (server3.getMedical_treatment21() != null || server3.getMedical_treatment23() != null) {
				insert.setScope162(5);
				scope += 5;
			}  else {
				insert.setScope162(0);
			}
		}

		if (!"".equals(server3.getScope171()) && server3.getScope171() != null) {
			insert.setScope171(strToInt(server3.getScope171()));
		} else {
			insert.setScope171(0);
		}

		if (!"".equals(server3.getScope172()) && server3.getScope172() != null) {
			insert.setScope172(strToInt(server3.getScope172()));
			scope += insert.getScope172();
		} else {
			if (server3.getPension1() != null) {
				insert.setScope172(3);
				scope += 3;
			}  else {
				insert.setScope172(0);
			}
		}

		if ("0".equals(server.getWorkers_size()) && server.getPoverty_level3() != null) {
			scope = 100;
		} else if (server2.getEat_n() != null 
				|| server2.getWear_n() != null 
				|| server3.getHouse2() != null
				|| server3.getEducation1() != null) {
			// 一票否决
			scope = 0;
		}
		
		if (!"".equals(server3.getScope182()) && server3.getScope182() != null) {
			insert.setScope182(strToInt(server3.getScope182()));
		} else {
			insert.setScope182(scope);
		}

		if (!"".equals(server3.getHouse_size()) && server3.getHouse_size() != null) {
			insert.setHouse_size(strToDouble(server3.getHouse_size()));
		} else {
			insert.setHouse_size(0.0);
		}

		if (!"".equals(server3.getFamily_n()) && server3.getFamily_n() != null) {
			insert.setFamily_n(strToInt(server3.getFamily_n()));
		} else {
			insert.setFamily_n(0);
		}

		if (!"".equals(server3.getPeople_size()) && server3.getPeople_size() != null) {
			insert.setPeople_size(strToDouble(server3.getPeople_size()));
		} else {
			insert.setPeople_size(0.0);
		}

		if (server3.getHouse_y() != null) {
			insert.setHouse_y(1);
		} else {
			insert.setHouse_y(0);
		}

		if (server3.getHouse_n() != null) {
			insert.setHouse_n(1);
		} else {
			insert.setHouse_n(0);
		}

		if (server3.getWater1() != null) {
			insert.setWater1(1);
		} else {
			insert.setWater1(0);
		}

		if (server3.getWater2() != null) {
			insert.setWater2(1);
		} else {
			insert.setWater2(0);
		}

		if (server3.getWater3() != null) {
			insert.setWater3(1);
		} else {
			insert.setWater3(0);
		}

		if (server3.getElectricity1() != null) {
			insert.setElectricity1(1);
		} else {
			insert.setElectricity1(0);
		}

		if (server3.getElectricity2() != null) {
			insert.setElectricity2(1);
		} else {
			insert.setElectricity2(0);
		}

		if (server3.getElectricity3() != null) {
			insert.setElectricity3(1);
		} else {
			insert.setElectricity3(0);
		}

		if (server3.getTraffic1() != null) {
			insert.setTraffic1(1);
		} else {
			insert.setTraffic1(0);
		}

		if (server3.getTraffic2() != null) {
			insert.setTraffic2(1);
		} else {
			insert.setTraffic2(0);
		}

		if (server3.getTraffic3() != null) {
			insert.setTraffic3(1);
		} else {
			insert.setTraffic3(0);
		}

		if (server3.getEducation1() != null) {
			insert.setEducation1(1);
		} else {
			insert.setEducation1(0);
		}

		if (server3.getEducation2() != null) {
			insert.setEducation2(1);
		} else {
			insert.setEducation2(0);
		}

		if (server3.getMedical_treatment11() != null) {
			insert.setMedical_treatment11(1);
		} else {
			insert.setMedical_treatment11(0);
		}

		if (server3.getMedical_treatment12() != null) {
			insert.setMedical_treatment12(1);
		} else {
			insert.setMedical_treatment12(0);
		}

		if (server3.getMedical_treatment21() != null) {
			insert.setMedical_treatment21(1);
		} else {
			insert.setMedical_treatment21(0);
		}

		if (server3.getMedical_treatment22() != null) {
			insert.setMedical_treatment22(1);
		} else {
			insert.setMedical_treatment22(0);
		}

		if (server3.getMedical_treatment23() != null) {
			insert.setMedical_treatment23(1);
		} else {
			insert.setMedical_treatment23(0);
		}

		if (server3.getPension1() != null) {
			insert.setPension1(1);
		} else {
			insert.setPension1(0);
		}

		if (server3.getPension2() != null) {
			insert.setPension2(1);
		} else {
			insert.setPension2(0);
		}

		return insert;
	}

	public static Date strToDate(String dateString) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		return sdf.parse(dateString);
	}

	public static int strToInt(String intString) throws Exception {
		return Integer.parseInt(intString);
	}

	public static Double strToDouble(String intString) throws Exception {
		return Double.parseDouble(intString);
	}
}
