package com.trusdata.tlhf.tdatajn.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author JBDING
 * 
 */
public class SetPactTdataJnBean {

	public static PactTdataJnBean setBean(PactTdataJnBean server)
			throws Exception {
		PactTdataJnBean insert = new PactTdataJnBean();

		if (!"".equals(server.getId()) && server.getId() != null) {
			insert.setId(server.getId());
		} else {
			insert.setId("");
		}

		if (!"".equals(server.getEntrusted_id())
				&& server.getEntrusted_id() != null) {
			insert.setEntrusted_id(server.getEntrusted_id());
		} else {
			insert.setEntrusted_id("");
		}

		if (!"".equals(server.getEntity_name())
				&& server.getEntity_name() != null) {
			insert.setEntity_name(server.getEntity_name());
		} else {
			insert.setEntity_name("");
		}

		if (!"".equals(server.getInput_name())
				&& server.getInput_name() != null) {
			insert.setInput_name(server.getInput_name());
		} else {
			insert.setInput_name("");
		}

		if (!"".equals(server.getSta_name()) && server.getSta_name() != null) {
			insert.setSta_name(server.getSta_name());
		} else {
			insert.setSta_name("");
		}

		if (!"".equals(server.getSta_size()) && server.getSta_size() != null) {
			insert.setSta_size(server.getSta_size());
		} else {
			insert.setSta_size("");
		}

		if (!"".equals(server.getSta_high()) && server.getSta_high() != null) {
			insert.setSta_high(server.getSta_high());
		} else {
			insert.setSta_high("");
		}

		if (!"".equals(server.getSta_length())
				&& server.getSta_length() != null) {
			insert.setSta_length(server.getSta_length());
		} else {
			insert.setSta_length("");
		}

		if (!"".equals(server.getSta_value_1())
				&& server.getSta_value_1() != null) {
			insert.setSta_value_1(server.getSta_value_1());
		} else {
			insert.setSta_value_1("");
		}

		if (!"".equals(server.getSta_value_2())
				&& server.getSta_value_2() != null) {
			insert.setSta_value_2(server.getSta_value_2());
		} else {
			insert.setSta_value_2("");
		}

		if (!"".equals(server.getSta_value_3())
				&& server.getSta_value_3() != null) {
			insert.setSta_value_3(server.getSta_value_3());
		} else {
			insert.setSta_value_3("");
		}

		if (!"".equals(server.getSta_value_4())
				&& server.getSta_value_4() != null) {
			insert.setSta_value_4(server.getSta_value_4());
		} else {
			insert.setSta_value_4("");
		}
		if (!"".equals(server.getSta_value_5())
				&& server.getSta_value_5() != null) {
			insert.setSta_value_5(server.getSta_value_5());
		} else {
			insert.setSta_value_5("");
		}
		if (!"".equals(server.getSta_value_6())
				&& server.getSta_value_6() != null) {
			insert.setSta_value_6(server.getSta_value_6());
		} else {
			insert.setSta_value_6("");
		}

		if (!"".equals(server.getSta_value_7())
				&& server.getSta_value_7() != null) {
			insert.setSta_value_7(server.getSta_value_7());
		} else {
			insert.setSta_value_7("");
		}

		if (!"".equals(server.getSta_value_8())
				&& server.getSta_value_8() != null) {
			insert.setSta_value_8(server.getSta_value_8());
		} else {
			insert.setSta_value_8("");
		}

		if (!"".equals(server.getSta_value_9())
				&& server.getSta_value_9() != null) {
			insert.setSta_value_9(server.getSta_value_9());
		} else {
			insert.setSta_value_9("");
		}

		if (!"".equals(server.getSta_value_10())
				&& server.getSta_value_10() != null) {
			insert.setSta_value_10(server.getSta_value_10());
		} else {
			insert.setSta_value_10("");
		}

		if (!"".equals(server.getSta_value_11())
				&& server.getSta_value_11() != null) {
			insert.setSta_value_11(server.getSta_value_11());
		} else {
			insert.setSta_value_11("");
		}

		if (!"".equals(server.getSta_value_12())
				&& server.getSta_value_12() != null) {
			insert.setSta_value_12(server.getSta_value_12());
		} else {
			insert.setSta_value_12("");
		}

		if (!"".equals(server.getSta_value_13())
				&& server.getSta_value_13() != null) {
			insert.setSta_value_13(server.getSta_value_13());
		} else {
			insert.setSta_value_13("");
		}

		if (!"".equals(server.getSta_value_14())
				&& server.getSta_value_14() != null) {
			insert.setSta_value_14(server.getSta_value_14());
		} else {
			insert.setSta_value_14("");
		}

		if (!"".equals(server.getSta_value_15())
				&& server.getSta_value_15() != null) {
			insert.setSta_value_15(server.getSta_value_15());
		} else {
			insert.setSta_value_15("");
		}

		if (!"".equals(server.getSta_value_16())
				&& server.getSta_value_16() != null) {
			insert.setSta_value_16(server.getSta_value_16());
		} else {
			insert.setSta_value_16("");
		}

		if (!"".equals(server.getSta_value_17())
				&& server.getSta_value_17() != null) {
			insert.setSta_value_17(server.getSta_value_17());
		} else {
			insert.setSta_value_17("");
		}

		if (!"".equals(server.getSta_value_18())
				&& server.getSta_value_18() != null) {
			insert.setSta_value_18(server.getSta_value_18());
		} else {
			insert.setSta_value_18("");
		}

		if (!"".equals(server.getSta_value_19())
				&& server.getSta_value_19() != null) {
			insert.setSta_value_19(server.getSta_value_19());
		} else {
			insert.setSta_value_19("");
		}

		if (!"".equals(server.getSta_value_20())
				&& server.getSta_value_20() != null) {
			insert.setSta_value_20(server.getSta_value_20());
		} else {
			insert.setSta_value_20("");
		}
		if (!"".equals(server.getSta_value_21())
				&& server.getSta_value_21() != null) {
			insert.setSta_value_21(server.getSta_value_21());
		} else {
			insert.setSta_value_21("");
		}
		if (!"".equals(server.getSta_value_22())
				&& server.getSta_value_22() != null) {
			insert.setSta_value_22(server.getSta_value_22());
		} else {
			insert.setSta_value_22("");
		}
		if (!"".equals(server.getSta_value_23())
				&& server.getSta_value_23() != null) {
			insert.setSta_value_23(server.getSta_value_23());
		} else {
			insert.setSta_value_23("");
		}
		if (!"".equals(server.getSta_value_24())
				&& server.getSta_value_24() != null) {
			insert.setSta_value_24(server.getSta_value_24());
		} else {
			insert.setSta_value_24("");
		}
		if (!"".equals(server.getSta_value_25())
				&& server.getSta_value_25() != null) {
			insert.setSta_value_25(server.getSta_value_25());
		} else {
			insert.setSta_value_25("");
		}
		if (!"".equals(server.getSta_value_26())
				&& server.getSta_value_26() != null) {
			insert.setSta_value_26(server.getSta_value_26());
		} else {
			insert.setSta_value_26("");
		}
		if (!"".equals(server.getSta_value_27())
				&& server.getSta_value_27() != null) {
			insert.setSta_value_27(server.getSta_value_27());
		} else {
			insert.setSta_value_27("");
		}
		if (!"".equals(server.getSta_value_28())
				&& server.getSta_value_28() != null) {
			insert.setSta_value_28(server.getSta_value_28());
		} else {
			insert.setSta_value_28("");
		}
		if (!"".equals(server.getSta_value_29())
				&& server.getSta_value_29() != null) {
			insert.setSta_value_29(server.getSta_value_29());
		} else {
			insert.setSta_value_29("");
		}
		if (!"".equals(server.getSta_value_30())
				&& server.getSta_value_30() != null) {
			insert.setSta_value_30(server.getSta_value_30());
		} else {
			insert.setSta_value_30("");
		}
		if (!"".equals(server.getSta_value_31())
				&& server.getSta_value_31() != null) {
			insert.setSta_value_31(server.getSta_value_31());
		} else {
			insert.setSta_value_31("");
		}
		if (!"".equals(server.getSta_value_32())
				&& server.getSta_value_32() != null) {
			insert.setSta_value_32(server.getSta_value_32());
		} else {
			insert.setSta_value_32("");
		}
		if (!"".equals(server.getSta_value_33())
				&& server.getSta_value_33() != null) {
			insert.setSta_value_33(server.getSta_value_33());
		} else {
			insert.setSta_value_33("");
		}
		if (!"".equals(server.getSta_value_34())
				&& server.getSta_value_34() != null) {
			insert.setSta_value_34(server.getSta_value_34());
		} else {
			insert.setSta_value_34("");
		}
		if (!"".equals(server.getSta_value_35())
				&& server.getSta_value_35() != null) {
			insert.setSta_value_35(server.getSta_value_35());
		} else {
			insert.setSta_value_35("");
		}
		if (!"".equals(server.getSta_value_36())
				&& server.getSta_value_36() != null) {
			insert.setSta_value_36(server.getSta_value_36());
		} else {
			insert.setSta_value_36("");
		}
		if (!"".equals(server.getSta_value_37())
				&& server.getSta_value_37() != null) {
			insert.setSta_value_37(server.getSta_value_37());
		} else {
			insert.setSta_value_37("");
		}
		if (!"".equals(server.getSta_value_38())
				&& server.getSta_value_38() != null) {
			insert.setSta_value_38(server.getSta_value_38());
		} else {
			insert.setSta_value_38("");
		}
		if (!"".equals(server.getSta_value_39())
				&& server.getSta_value_39() != null) {
			insert.setSta_value_39(server.getSta_value_39());
		} else {
			insert.setSta_value_39("");
		}
		if (!"".equals(server.getSta_value_40())
				&& server.getSta_value_40() != null) {
			insert.setSta_value_40(server.getSta_value_40());
		} else {
			insert.setSta_value_40("");
		}
		if (!"".equals(server.getSta_value_41())
				&& server.getSta_value_41() != null) {
			insert.setSta_value_41(server.getSta_value_41());
		} else {
			insert.setSta_value_41("");
		}
		if (!"".equals(server.getSta_value_42())
				&& server.getSta_value_42() != null) {
			insert.setSta_value_42(server.getSta_value_42());
		} else {
			insert.setSta_value_42("");
		}
		if (!"".equals(server.getSta_value_43())
				&& server.getSta_value_43() != null) {
			insert.setSta_value_43(server.getSta_value_43());
		} else {
			insert.setSta_value_43("");
		}
		if (!"".equals(server.getSta_value_44())
				&& server.getSta_value_44() != null) {
			insert.setSta_value_44(server.getSta_value_44());
		} else {
			insert.setSta_value_44("");
		}
		if (!"".equals(server.getSta_value_45())
				&& server.getSta_value_45() != null) {
			insert.setSta_value_45(server.getSta_value_45());
		} else {
			insert.setSta_value_45("");
		}
		if (!"".equals(server.getSta_value_46())
				&& server.getSta_value_46() != null) {
			insert.setSta_value_46(server.getSta_value_46());
		} else {
			insert.setSta_value_46("");
		}
		if (!"".equals(server.getSta_value_47())
				&& server.getSta_value_47() != null) {
			insert.setSta_value_47(server.getSta_value_47());
		} else {
			insert.setSta_value_47("");
		}
		if (!"".equals(server.getSta_value_48())
				&& server.getSta_value_48() != null) {
			insert.setSta_value_48(server.getSta_value_48());
		} else {
			insert.setSta_value_48("");
		}
		if (!"".equals(server.getSta_value_49())
				&& server.getSta_value_49() != null) {
			insert.setSta_value_49(server.getSta_value_49());
		} else {
			insert.setSta_value_49("");
		}
		if (!"".equals(server.getSta_value_50())
				&& server.getSta_value_50() != null) {
			insert.setSta_value_50(server.getSta_value_50());
		} else {
			insert.setSta_value_50("");
		}
		if (!"".equals(server.getSta_value_51())
				&& server.getSta_value_51() != null) {
			insert.setSta_value_51(server.getSta_value_51());
		} else {
			insert.setSta_value_51("");
		}
		if (!"".equals(server.getSta_value_52())
				&& server.getSta_value_52() != null) {
			insert.setSta_value_52(server.getSta_value_52());
		} else {
			insert.setSta_value_52("");
		}
		if (!"".equals(server.getSta_value_53())
				&& server.getSta_value_53() != null) {
			insert.setSta_value_53(server.getSta_value_53());
		} else {
			insert.setSta_value_53("");
		}
		if (!"".equals(server.getSta_value_54())
				&& server.getSta_value_54() != null) {
			insert.setSta_value_54(server.getSta_value_54());
		} else {
			insert.setSta_value_54("");
		}
		if (!"".equals(server.getSta_value_55())
				&& server.getSta_value_55() != null) {
			insert.setSta_value_55(server.getSta_value_55());
		} else {
			insert.setSta_value_55("");
		}
		if (!"".equals(server.getSta_value_56())
				&& server.getSta_value_56() != null) {
			insert.setSta_value_56(server.getSta_value_56());
		} else {
			insert.setSta_value_56("");
		}
		if (!"".equals(server.getSta_value_57())
				&& server.getSta_value_57() != null) {
			insert.setSta_value_57(server.getSta_value_57());
		} else {
			insert.setSta_value_57("");
		}
		if (!"".equals(server.getSta_value_58())
				&& server.getSta_value_58() != null) {
			insert.setSta_value_58(server.getSta_value_58());
		} else {
			insert.setSta_value_58("");
		}
		if (!"".equals(server.getSta_value_59())
				&& server.getSta_value_59() != null) {
			insert.setSta_value_59(server.getSta_value_59());
		} else {
			insert.setSta_value_59("");
		}
		if (!"".equals(server.getSta_value_60())
				&& server.getSta_value_60() != null) {
			insert.setSta_value_60(server.getSta_value_60());
		} else {
			insert.setSta_value_60("");
		}
		if (!"".equals(server.getSta_value_61())
				&& server.getSta_value_61() != null) {
			insert.setSta_value_61(server.getSta_value_61());
		} else {
			insert.setSta_value_61("");
		}
		if (!"".equals(server.getSta_value_62())
				&& server.getSta_value_62() != null) {
			insert.setSta_value_62(server.getSta_value_62());
		} else {
			insert.setSta_value_62("");
		}
		if (!"".equals(server.getSta_value_63())
				&& server.getSta_value_63() != null) {
			insert.setSta_value_63(server.getSta_value_63());
		} else {
			insert.setSta_value_63("");
		}
		if (!"".equals(server.getSta_value_64())
				&& server.getSta_value_64() != null) {
			insert.setSta_value_64(server.getSta_value_64());
		} else {
			insert.setSta_value_64("");
		}
		if (!"".equals(server.getSta_value_65())
				&& server.getSta_value_65() != null) {
			insert.setSta_value_65(server.getSta_value_65());
		} else {
			insert.setSta_value_65("");
		}
		if (!"".equals(server.getSta_value_66())
				&& server.getSta_value_66() != null) {
			insert.setSta_value_66(server.getSta_value_66());
		} else {
			insert.setSta_value_66("");
		}
		if (!"".equals(server.getSta_value_67())
				&& server.getSta_value_67() != null) {
			insert.setSta_value_67(server.getSta_value_67());
		} else {
			insert.setSta_value_67("");
		}
		if (!"".equals(server.getSta_value_68())
				&& server.getSta_value_68() != null) {
			insert.setSta_value_68(server.getSta_value_68());
		} else {
			insert.setSta_value_68("");
		}
		if (!"".equals(server.getSta_value_69())
				&& server.getSta_value_69() != null) {
			insert.setSta_value_69(server.getSta_value_69());
		} else {
			insert.setSta_value_69("");
		}
		if (!"".equals(server.getSta_value_70())
				&& server.getSta_value_70() != null) {
			insert.setSta_value_70(server.getSta_value_70());
		} else {
			insert.setSta_value_70("");
		}
		if (!"".equals(server.getSta_value_71())
				&& server.getSta_value_71() != null) {
			insert.setSta_value_71(server.getSta_value_71());
		} else {
			insert.setSta_value_71("");
		}
		if (!"".equals(server.getSta_value_72())
				&& server.getSta_value_72() != null) {
			insert.setSta_value_72(server.getSta_value_72());
		} else {
			insert.setSta_value_72("");
		}
		if (!"".equals(server.getSta_value_73())
				&& server.getSta_value_73() != null) {
			insert.setSta_value_73(server.getSta_value_73());
		} else {
			insert.setSta_value_73("");
		}
		if (!"".equals(server.getSta_value_74())
				&& server.getSta_value_74() != null) {
			insert.setSta_value_74(server.getSta_value_74());
		} else {
			insert.setSta_value_74("");
		}
		if (!"".equals(server.getSta_value_75())
				&& server.getSta_value_75() != null) {
			insert.setSta_value_75(server.getSta_value_75());
		} else {
			insert.setSta_value_75("");
		}
		if (!"".equals(server.getSta_value_76())
				&& server.getSta_value_76() != null) {
			insert.setSta_value_76(server.getSta_value_76());
		} else {
			insert.setSta_value_76("");
		}
		if (!"".equals(server.getSta_value_77())
				&& server.getSta_value_77() != null) {
			insert.setSta_value_77(server.getSta_value_77());
		} else {
			insert.setSta_value_77("");
		}
		if (!"".equals(server.getSta_value_78())
				&& server.getSta_value_78() != null) {
			insert.setSta_value_78(server.getSta_value_78());
		} else {
			insert.setSta_value_78("");
		}
		if (!"".equals(server.getSta_value_79())
				&& server.getSta_value_79() != null) {
			insert.setSta_value_79(server.getSta_value_79());
		} else {
			insert.setSta_value_79("");
		}
		if (!"".equals(server.getSta_value_80())
				&& server.getSta_value_80() != null) {
			insert.setSta_value_80(server.getSta_value_80());
		} else {
			insert.setSta_value_80("");
		}
		if (!"".equals(server.getSta_value_81())
				&& server.getSta_value_81() != null) {
			insert.setSta_value_81(server.getSta_value_81());
		} else {
			insert.setSta_value_81("");
		}
		if (!"".equals(server.getSta_value_82())
				&& server.getSta_value_82() != null) {
			insert.setSta_value_82(server.getSta_value_82());
		} else {
			insert.setSta_value_82("");
		}
		if (!"".equals(server.getSta_value_83())
				&& server.getSta_value_83() != null) {
			insert.setSta_value_83(server.getSta_value_83());
		} else {
			insert.setSta_value_83("");
		}
		if (!"".equals(server.getSta_value_84())
				&& server.getSta_value_84() != null) {
			insert.setSta_value_84(server.getSta_value_84());
		} else {
			insert.setSta_value_84("");
		}
		if (!"".equals(server.getSta_value_85())
				&& server.getSta_value_85() != null) {
			insert.setSta_value_85(server.getSta_value_85());
		} else {
			insert.setSta_value_85("");
		}
		if (!"".equals(server.getSta_value_86())
				&& server.getSta_value_86() != null) {
			insert.setSta_value_86(server.getSta_value_86());
		} else {
			insert.setSta_value_86("");
		}
		if (!"".equals(server.getSta_value_87())
				&& server.getSta_value_87() != null) {
			insert.setSta_value_87(server.getSta_value_87());
		} else {
			insert.setSta_value_87("");
		}
		if (!"".equals(server.getSta_value_88())
				&& server.getSta_value_88() != null) {
			insert.setSta_value_88(server.getSta_value_88());
		} else {
			insert.setSta_value_88("");
		}
		if (!"".equals(server.getSta_value_89())
				&& server.getSta_value_89() != null) {
			insert.setSta_value_89(server.getSta_value_89());
		} else {
			insert.setSta_value_89("");
		}
		if (!"".equals(server.getSta_value_90())
				&& server.getSta_value_90() != null) {
			insert.setSta_value_90(server.getSta_value_90());
		} else {
			insert.setSta_value_90("");
		}
		if (!"".equals(server.getSta_value_91())
				&& server.getSta_value_91() != null) {
			insert.setSta_value_91(server.getSta_value_91());
		} else {
			insert.setSta_value_91("");
		}
		if (!"".equals(server.getSta_value_92())
				&& server.getSta_value_92() != null) {
			insert.setSta_value_92(server.getSta_value_92());
		} else {
			insert.setSta_value_92("");
		}
		if (!"".equals(server.getSta_value_93())
				&& server.getSta_value_93() != null) {
			insert.setSta_value_93(server.getSta_value_93());
		} else {
			insert.setSta_value_93("");
		}
		if (!"".equals(server.getSta_value_94())
				&& server.getSta_value_94() != null) {
			insert.setSta_value_94(server.getSta_value_94());
		} else {
			insert.setSta_value_94("");
		}
		if (!"".equals(server.getSta_value_95())
				&& server.getSta_value_95() != null) {
			insert.setSta_value_95(server.getSta_value_95());
		} else {
			insert.setSta_value_95("");
		}
		if (!"".equals(server.getSta_value_96())
				&& server.getSta_value_96() != null) {
			insert.setSta_value_96(server.getSta_value_96());
		} else {
			insert.setSta_value_96("");
		}
		if (!"".equals(server.getSta_value_97())
				&& server.getSta_value_97() != null) {
			insert.setSta_value_97(server.getSta_value_97());
		} else {
			insert.setSta_value_97("");
		}
		if (!"".equals(server.getSta_value_98())
				&& server.getSta_value_98() != null) {
			insert.setSta_value_98(server.getSta_value_98());
		} else {
			insert.setSta_value_98("");
		}
		if (!"".equals(server.getSta_value_99())
				&& server.getSta_value_99() != null) {
			insert.setSta_value_99(server.getSta_value_99());
		} else {
			insert.setSta_value_99("");
		}
		if (!"".equals(server.getSta_value_100())
				&& server.getSta_value_100() != null) {
			insert.setSta_value_100(server.getSta_value_100());
		} else {
			insert.setSta_value_100("");
		}
		if (!"".equals(server.getSta_value_101())
				&& server.getSta_value_101() != null) {
			insert.setSta_value_101(server.getSta_value_101());
		} else {
			insert.setSta_value_101("");
		}
		if (!"".equals(server.getSta_value_102())
				&& server.getSta_value_102() != null) {
			insert.setSta_value_102(server.getSta_value_102());
		} else {
			insert.setSta_value_102("");
		}
		if (!"".equals(server.getSta_value_103())
				&& server.getSta_value_103() != null) {
			insert.setSta_value_103(server.getSta_value_103());
		} else {
			insert.setSta_value_103("");
		}
		if (!"".equals(server.getSta_value_104())
				&& server.getSta_value_104() != null) {
			insert.setSta_value_104(server.getSta_value_104());
		} else {
			insert.setSta_value_104("");
		}
		if (!"".equals(server.getSta_value_105())
				&& server.getSta_value_105() != null) {
			insert.setSta_value_105(server.getSta_value_105());
		} else {
			insert.setSta_value_105("");
		}
		if (!"".equals(server.getSta_value_106())
				&& server.getSta_value_106() != null) {
			insert.setSta_value_106(server.getSta_value_106());
		} else {
			insert.setSta_value_106("");
		}
		if (!"".equals(server.getSta_value_107())
				&& server.getSta_value_107() != null) {
			insert.setSta_value_107(server.getSta_value_107());
		} else {
			insert.setSta_value_107("");
		}
		if (!"".equals(server.getSta_value_108())
				&& server.getSta_value_108() != null) {
			insert.setSta_value_108(server.getSta_value_108());
		} else {
			insert.setSta_value_108("");
		}
		if (!"".equals(server.getSta_value_109())
				&& server.getSta_value_109() != null) {
			insert.setSta_value_109(server.getSta_value_109());
		} else {
			insert.setSta_value_109("");
		}
		if (!"".equals(server.getSta_value_110())
				&& server.getSta_value_110() != null) {
			insert.setSta_value_110(server.getSta_value_110());
		} else {
			insert.setSta_value_110("");
		}
		if (!"".equals(server.getSta_value_111())
				&& server.getSta_value_111() != null) {
			insert.setSta_value_111(server.getSta_value_111());
		} else {
			insert.setSta_value_111("");
		}
		if (!"".equals(server.getSta_value_112())
				&& server.getSta_value_112() != null) {
			insert.setSta_value_112(server.getSta_value_112());
		} else {
			insert.setSta_value_112("");
		}
		if (!"".equals(server.getSta_value_113())
				&& server.getSta_value_113() != null) {
			insert.setSta_value_113(server.getSta_value_113());
		} else {
			insert.setSta_value_113("");
		}
		if (!"".equals(server.getSta_value_114())
				&& server.getSta_value_114() != null) {
			insert.setSta_value_114(server.getSta_value_114());
		} else {
			insert.setSta_value_114("");
		}
		if (!"".equals(server.getSta_value_115())
				&& server.getSta_value_115() != null) {
			insert.setSta_value_115(server.getSta_value_115());
		} else {
			insert.setSta_value_115("");
		}
		if (!"".equals(server.getSta_value_116())
				&& server.getSta_value_116() != null) {
			insert.setSta_value_116(server.getSta_value_116());
		} else {
			insert.setSta_value_116("");
		}
		if (!"".equals(server.getSta_value_117())
				&& server.getSta_value_117() != null) {
			insert.setSta_value_117(server.getSta_value_117());
		} else {
			insert.setSta_value_117("");
		}
		if (!"".equals(server.getSta_value_118())
				&& server.getSta_value_118() != null) {
			insert.setSta_value_118(server.getSta_value_118());
		} else {
			insert.setSta_value_118("");
		}
		if (!"".equals(server.getSta_value_119())
				&& server.getSta_value_119() != null) {
			insert.setSta_value_119(server.getSta_value_119());
		} else {
			insert.setSta_value_119("");
		}
		if (!"".equals(server.getSta_value_120())
				&& server.getSta_value_120() != null) {
			insert.setSta_value_120(server.getSta_value_120());
		} else {
			insert.setSta_value_120("");
		}
		if (!"".equals(server.getSta_avg_value())
				&& server.getSta_avg_value() != null) {
			insert.setSta_avg_value(server.getSta_avg_value());
		} else {
			insert.setSta_avg_value("");
		}
		if (!"".equals(server.getSta_des_value())
				&& server.getSta_des_value() != null) {
			insert.setSta_des_value(server.getSta_des_value());
		} else {
			insert.setSta_des_value("");
		}

		if (!"".equals(server.getSta_bias()) && server.getSta_bias() != null) {
			insert.setSta_bias(server.getSta_bias());
		} else {
			insert.setSta_bias("");
		}

		if (!"".equals(server.getSta_electricity())
				&& server.getSta_electricity() != null) {
			insert.setSta_electricity(server.getSta_electricity());
		} else {
			insert.setSta_electricity("");
		}

		if (!"".equals(server.getSta_diany()) && server.getSta_diany() != null) {
			insert.setSta_diany(server.getSta_diany());
		} else {
			insert.setSta_diany("");
		}

		if (!"".equals(server.getSta_act_value())
				&& server.getSta_act_value() != null) {
			insert.setSta_act_value(server.getSta_act_value());
		} else {
			insert.setSta_act_value("");
		}

		if (!"".equals(server.getSta_wm2_value())
				&& server.getSta_wm2_value() != null) {
			insert.setSta_wm2_value(server.getSta_wm2_value());
		} else {
			insert.setSta_wm2_value("");
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
