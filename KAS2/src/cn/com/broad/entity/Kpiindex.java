package cn.com.broad.entity;

/*
 *kpi指标类
 * */
public class Kpiindex {
	private int kpiIndexID;// pki指标ID
	private String kpiIndexName;// kpi指标名称
	private int moduleID;// kpi模块ID
	private int postID;// 岗位ID
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
	private int ifDelete;// 是否删除1--隐藏，0---显示

	public int getIfDelete() {
		return ifDelete;
	}

	public void setIfDelete(int ifDelete) {
		this.ifDelete = ifDelete;
	}

	public int getKpiIndexID() {
		return kpiIndexID;
	}

	public void setKpiIndexID(int kpiIndexID) {
		this.kpiIndexID = kpiIndexID;
	}

	public String getKpiIndexName() {
		return kpiIndexName;
	}

	public void setKpiIndexName(String kpiIndexName) {
		this.kpiIndexName = kpiIndexName;
	}

	public int getModuleID() {
		return moduleID;
	}

	public void setModuleID(int moduleID) {
		this.moduleID = moduleID;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
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

	public Kpiindex(int kpiIndexID, String kpiIndexName, int postID, String weight, String span, String indexDefinition,
			String dateSources, String computationalFormula, String annualObjectives, String quarterlyAccounting,
			String currentTarget, String currentReality, String currentYieldRate, String currentScore) {
		super();
		this.kpiIndexID = kpiIndexID;
		this.kpiIndexName = kpiIndexName;
		this.postID = postID;
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

	public Kpiindex(int kpiIndexID, int postID, String weight, String span, String indexDefinition, String dateSources,
			String computationalFormula, String annualObjectives, String quarterlyAccounting, String currentTarget,
			String currentReality, String currentYieldRate, String currentScore) {
		super();
		this.kpiIndexID = kpiIndexID;
		this.postID = postID;
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

	@Override
	public String toString() {
		return "Kpiindex [kpiIndexID=" + kpiIndexID + ", kpiIndexName=" + kpiIndexName + ", moduleID=" + moduleID
				+ ", postID=" + postID + ", weight=" + weight + ", span=" + span + ", indexDefinition="
				+ indexDefinition + ", dateSources=" + dateSources + ", computationalFormula=" + computationalFormula
				+ ", annualObjectives=" + annualObjectives + ", quarterlyAccounting=" + quarterlyAccounting
				+ ", currentTarget=" + currentTarget + ", currentReality=" + currentReality + ", currentYieldRate="
				+ currentYieldRate + ", currentScore=" + currentScore + ", ifDelete=" + ifDelete + "]";
	}

	public Kpiindex(String kpiIndexName, int moduleID, int postID, String weight, String span, String indexDefinition,
			String dateSources, String computationalFormula, String annualObjectives, String quarterlyAccounting,
			String currentTarget, String currentReality, String currentYieldRate, String currentScore) {
		super();
		this.kpiIndexName = kpiIndexName;
		this.moduleID = moduleID;
		this.postID = postID;
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

	public Kpiindex(int kpiIndexID, String kpiIndexName, int moduleID, int postID, String weight, String span,
			String indexDefinition, String dateSources, String computationalFormula, String annualObjectives,
			String quarterlyAccounting, String currentTarget, String currentReality, String currentYieldRate,
			String currentScore, int ifdelete) {
		super();
		this.kpiIndexID = kpiIndexID;
		this.kpiIndexName = kpiIndexName;
		this.moduleID = moduleID;
		this.postID = postID;
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
		this.ifDelete = ifdelete;
	}

	public Kpiindex() {
		super();
	}

}
