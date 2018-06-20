package cn.com.broad.entity;

/*
 * 员工KPI指标类
 * */
public class StaffKpiIndex {
	private String staffName;// 员工名称
	private String postName;// 岗位名称
	private String moduleName;// 模块名称
	private String kpiIndexName;// kpi指标名称
	private String weight;// 权重
	private String span;// 取值范围
	private String indexDefinition;// 指标释义
	private String dateSources;// 数据来源
	private String computationalFormula;// 计算公式
	private String annualObjectives;// 年度目标
	private String quarterlyAccounting;// 季度核算
	private String currentTarget;// 当期目标
	private String currentReality;// 当期实际
	private String currentYieldRate;// 当期达成率
	private String currentScore;// 当期得分

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getKpiIndexName() {
		return kpiIndexName;
	}

	public void setKpiIndexName(String kpiIndexName) {
		this.kpiIndexName = kpiIndexName;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSpan() {
		return span;
	}

	public void setSpan(String span) {
		this.span = span;
	}

	public String getIndexDefinition() {
		return indexDefinition;
	}

	public void setIndexDefinition(String indexDefinition) {
		this.indexDefinition = indexDefinition;
	}

	public String getDateSources() {
		return dateSources;
	}

	public void setDateSources(String dateSources) {
		this.dateSources = dateSources;
	}

	public String getComputationalFormula() {
		return computationalFormula;
	}

	public void setComputationalFormula(String computationalFormula) {
		this.computationalFormula = computationalFormula;
	}

	public String getAnnualObjectives() {
		return annualObjectives;
	}

	public void setAnnualObjectives(String annualObjectives) {
		this.annualObjectives = annualObjectives;
	}

	public String getQuarterlyAccounting() {
		return quarterlyAccounting;
	}

	public void setQuarterlyAccounting(String quarterlyAccounting) {
		this.quarterlyAccounting = quarterlyAccounting;
	}

	public String getCurrentTarget() {
		return currentTarget;
	}

	public void setCurrentTarget(String currentTarget) {
		this.currentTarget = currentTarget;
	}

	public String getCurrentReality() {
		return currentReality;
	}

	public void setCurrentReality(String currentReality) {
		this.currentReality = currentReality;
	}

	public String getCurrentYieldRate() {
		return currentYieldRate;
	}

	public void setCurrentYieldRate(String currentYieldRate) {
		this.currentYieldRate = currentYieldRate;
	}

	public String getCurrentScore() {
		return currentScore;
	}

	public void setCurrentScore(String currentScore) {
		this.currentScore = currentScore;
	}

	public StaffKpiIndex(String staffName, String postName, String moduleName, String kpiIndexName, String weight,
			String span, String indexDefinition, String dateSources, String computationalFormula,
			String annualObjectives, String quarterlyAccounting, String currentTarget, String currentReality,
			String currentYieldRate, String currentScore) {
		super();
		this.staffName = staffName;
		this.postName = postName;
		this.moduleName = moduleName;
		this.kpiIndexName = kpiIndexName;
		this.weight = weight;
		this.span = span;
		this.indexDefinition = indexDefinition;
		this.dateSources = dateSources;
		this.computationalFormula = computationalFormula;
		this.annualObjectives = annualObjectives;
		this.quarterlyAccounting = quarterlyAccounting;
		this.currentTarget = currentTarget;
		this.currentReality = currentReality;
		this.currentYieldRate = currentYieldRate;
		this.currentScore = currentScore;
	}

	public StaffKpiIndex() {
		super();
	}

	@Override
	public String toString() {
		return "StaffKpiIndex [staffName=" + staffName + ", postName=" + postName + ", moduleName=" + moduleName
				+ ", kpiIndexName=" + kpiIndexName + ", weight=" + weight + ", span=" + span + ", indexDefinition="
				+ indexDefinition + ", dateSources=" + dateSources + ", computationalFormula=" + computationalFormula
				+ ", annualObjectives=" + annualObjectives + ", quarterlyAccounting=" + quarterlyAccounting
				+ ", currentTarget=" + currentTarget + ", currentReality=" + currentReality + ", currentYieldRate="
				+ currentYieldRate + ", currentScore=" + currentScore + "]";
	}

}
