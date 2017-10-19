import java.io.IOException;
import java.util.List;
import java.util.Map;

import armor.core.infrastructure.component.dto.JSONResult;
import armor.core.tool.JSONMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import override.com.github.bohnman.squiggly.Squiggly;
import com.github.bohnman.squiggly.util.SquigglyUtils;
import com.google.common.collect.Lists;

/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */

/**
 * TODO
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年8月2日
 */
public class T {

	private String a;
	
	private List<A> as;
	
	private Map<String, B> bs;
	
	public static void main(String[] args) throws IOException {
		ObjectMapper m = JSONMapper.withApiConfig();
		T t = new T();
		t.setA("aaa");
		A a1 = new A("a1");
		a1.setX("a1-xxx");
		a1.setBs(Lists.newArrayList(new B("a1-b1","a1-d1","p1"),new B("a1-b2","a1-d2","p2"),new B("a1-b3","a1-d3","p3"),new B("a1-b4","a1-d4","p4")));
		A a2 = new A("a2");
		a2.setX("a2-xxx");
		a2.setBs(Lists.newArrayList(new B("a2-b1","a2-d1","p1"),new B("a2-b2","a2-d2","p2"),new B("a2-b3","a2-d3","p1"),new B("a2-b4","a2-d4","p4")));
		t.setAs(Lists.newArrayList(a1,a2));
		String s = m.writeValueAsString(t);
		Map<String, Object> result = m.readValue(s, new TypeReference<Map<String, Object>>(){});
		JSONResult<Object> json = new JSONResult<>();
		json.setMessage("ok");
		json.setCode("code1");
		json.setData(result);
//		ObjectMapper objectMapper = Squiggly.init(JSONMapper.withGatewayConfig(), "**,-as[bs[name]]");
//		ObjectMapper objectMapper = Squiggly.init(m, "**");
		ObjectMapper objectMapper = Squiggly.init(m, "data.as.bs[-name],data[-a]");
//		ObjectMapper objectMapper = Squiggly.init(m, "**,as{**,bs{-name}}");
//		ObjectMapper objectMapper = Squiggly.init(JSONMapper.withGatewayConfig(), "**,as[-bs[-name]]");
		System.out.println(SquigglyUtils.stringify(objectMapper, json));
//		System.out.println(SquigglyUtils.stringify(m, json));
	}
	
	public static String wrap(String filters) {
		StringBuilder sb = new StringBuilder("**,{");
		for(String filter : filters.split(",")){
			if(filter.trim().startsWith("-")){
			}
		}
		sb.append("}");
		return "";
	}
	
	/**
	 * @return property value of a
	 */
	public String getA() {
		return a;
	}

	/**
	 * @param a value to be assigned to property a
	 */
	public void setA(String a) {
		this.a = a;
	}

	/**
	 * @return property value of as
	 */
	public List<A> getAs() {
		return as;
	}

	/**
	 * @param as value to be assigned to property as
	 */
	public void setAs(List<A> as) {
		this.as = as;
	}

	/**
	 * @return property value of bs
	 */
	public Map<String, B> getBs() {
		return bs;
	}

	/**
	 * @param bs value to be assigned to property bs
	 */
	public void setBs(Map<String, B> bs) {
		this.bs = bs;
	}

	public static class A{
		private List<B> bs;
		
		private String x;

		/**
		 * Creates a new instance of A
		 * 
		 * @param x
		 */
		public A(String x) {
			super();
			this.x = x;
		}

		/**
		 * @return property value of bs
		 */
		public List<B> getBs() {
			return bs;
		}

		/**
		 * @param bs value to be assigned to property bs
		 */
		public void setBs(List<B> bs) {
			this.bs = bs;
		}

		/**
		 * @return property value of x
		 */
		public String getX() {
			return x;
		}

		/**
		 * @param x value to be assigned to property x
		 */
		public void setX(String x) {
			this.x = x;
		}
	}
	
	public static class B{
		
		private String name;

		private String desc;
		
		private String pwd;

		/**
		 * @return property value of pwd
		 */
		public String getPwd() {
			return pwd;
		}

		/**
		 * @param pwd value to be assigned to property pwd
		 */
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		/**
		 * Creates a new instance of B
		 * 
		 * @param name
		 * @param desc
		 */
		public B(String name, String desc, String pwd) {
			super();
			this.name = name;
			this.desc = desc;
			this.pwd = pwd;
		}

		/**
		 * @return property value of name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name value to be assigned to property name
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return property value of desc
		 */
		public String getDesc() {
			return desc;
		}

		/**
		 * @param desc value to be assigned to property desc
		 */
		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
}
