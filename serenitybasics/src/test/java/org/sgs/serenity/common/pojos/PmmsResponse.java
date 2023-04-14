package org.sgs.serenity.common.pojos;

import java.util.ArrayList;
import java.util.List;

public class PmmsResponse {
	public Integer pmStandardRuleId;
	public Integer pharmacyEffectiveDateId;
	public Integer claimReportingApplicationId;
	public Integer priorityNbr;
	public String ruleNm;
	public List<String> pharmacyChannelCd = new ArrayList<String>();
	public Object pharmacyNetworkInd;
	public Object daysSupplyCriteriaCd;
	public Integer daysSupplyCnt;
	public Integer beginDaysSupplyCnt;
	public Integer endDaysSupplyCnt;
	public Integer drugListId;
	public Boolean drugListInd;
	public Integer prescriberListId;
	public Boolean prescriberListInd;
	public Integer pharmacyListId;
	public Boolean pharmacyListInd;
	public Integer productListId;
	public Boolean productListInd;
	public Integer dynamicListId;
	public Boolean dynamicListInd;
	public Integer conditionId;
	public Boolean conditionInd;
	public List<String> internalErrorCd = new ArrayList<String>();
	public String errorCodeBehavior;
	public Integer messageId;
	public Integer claimReportingIndicator;
	public String indicatorTitle;

	public Integer getPmStandardRuleId() {
		return pmStandardRuleId;
	}

	public void setPmStandardRuleId(Integer pmStandardRuleId) {
		this.pmStandardRuleId = pmStandardRuleId;
	}

	public Integer getPharmacyEffectiveDateId() {
		return pharmacyEffectiveDateId;
	}

	public void setPharmacyEffectiveDateId(Integer pharmacyEffectiveDateId) {
		this.pharmacyEffectiveDateId = pharmacyEffectiveDateId;
	}

	public Integer getClaimReportingApplicationId() {
		return claimReportingApplicationId;
	}

	public void setClaimReportingApplicationId(Integer claimReportingApplicationId) {
		this.claimReportingApplicationId = claimReportingApplicationId;
	}

	public Integer getPriorityNbr() {
		return priorityNbr;
	}

	public void setPriorityNbr(Integer priorityNbr) {
		this.priorityNbr = priorityNbr;
	}

	public String getRuleNm() {
		return ruleNm;
	}

	public void setRuleNm(String ruleNm) {
		this.ruleNm = ruleNm;
	}

	public List<String> getPharmacyChannelCd() {
		return pharmacyChannelCd;
	}

	public void setPharmacyChannelCd(List<String> pharmacyChannelCd) {
		this.pharmacyChannelCd = pharmacyChannelCd;
	}

	public Object getPharmacyNetworkInd() {
		return pharmacyNetworkInd;
	}

	public void setPharmacyNetworkInd(Object pharmacyNetworkInd) {
		this.pharmacyNetworkInd = pharmacyNetworkInd;
	}

	public Object getDaysSupplyCriteriaCd() {
		return daysSupplyCriteriaCd;
	}

	public void setDaysSupplyCriteriaCd(Object daysSupplyCriteriaCd) {
		this.daysSupplyCriteriaCd = daysSupplyCriteriaCd;
	}

	public Integer getDaysSupplyCnt() {
		return daysSupplyCnt;
	}

	public void setDaysSupplyCnt(Integer daysSupplyCnt) {
		this.daysSupplyCnt = daysSupplyCnt;
	}

	public Integer getBeginDaysSupplyCnt() {
		return beginDaysSupplyCnt;
	}

	public void setBeginDaysSupplyCnt(Integer beginDaysSupplyCnt) {
		this.beginDaysSupplyCnt = beginDaysSupplyCnt;
	}

	public Integer getEndDaysSupplyCnt() {
		return endDaysSupplyCnt;
	}

	public void setEndDaysSupplyCnt(Integer endDaysSupplyCnt) {
		this.endDaysSupplyCnt = endDaysSupplyCnt;
	}

	public Integer getDrugListId() {
		return drugListId;
	}

	public void setDrugListId(Integer drugListId) {
		this.drugListId = drugListId;
	}

	public Boolean getDrugListInd() {
		return drugListInd;
	}

	public void setDrugListInd(Boolean drugListInd) {
		this.drugListInd = drugListInd;
	}

	public Integer getPrescriberListId() {
		return prescriberListId;
	}

	public void setPrescriberListId(Integer prescriberListId) {
		this.prescriberListId = prescriberListId;
	}

	public Boolean getPrescriberListInd() {
		return prescriberListInd;
	}

	public void setPrescriberListInd(Boolean prescriberListInd) {
		this.prescriberListInd = prescriberListInd;
	}

	public Integer getPharmacyListId() {
		return pharmacyListId;
	}

	public void setPharmacyListId(Integer pharmacyListId) {
		this.pharmacyListId = pharmacyListId;
	}

	public Boolean getPharmacyListInd() {
		return pharmacyListInd;
	}

	public void setPharmacyListInd(Boolean pharmacyListInd) {
		this.pharmacyListInd = pharmacyListInd;
	}

	public Integer getProductListId() {
		return productListId;
	}

	public void setProductListId(Integer productListId) {
		this.productListId = productListId;
	}

	public Boolean getProductListInd() {
		return productListInd;
	}

	public void setProductListInd(Boolean productListInd) {
		this.productListInd = productListInd;
	}

	public Integer getDynamicListId() {
		return dynamicListId;
	}

	public void setDynamicListId(Integer dynamicListId) {
		this.dynamicListId = dynamicListId;
	}

	public Boolean getDynamicListInd() {
		return dynamicListInd;
	}

	public void setDynamicListInd(Boolean dynamicListInd) {
		this.dynamicListInd = dynamicListInd;
	}

	public Integer getConditionId() {
		return conditionId;
	}

	public void setConditionId(Integer conditionId) {
		this.conditionId = conditionId;
	}

	public Boolean getConditionInd() {
		return conditionInd;
	}

	public void setConditionInd(Boolean conditionInd) {
		this.conditionInd = conditionInd;
	}

	public List<String> getInternalErrorCd() {
		return internalErrorCd;
	}

	public void setInternalErrorCd(List<String> internalErrorCd) {
		this.internalErrorCd = internalErrorCd;
	}

	public String getErrorCodeBehavior() {
		return errorCodeBehavior;
	}

	public void setErrorCodeBehavior(String errorCodeBehavior) {
		this.errorCodeBehavior = errorCodeBehavior;
	}

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public Integer getClaimReportingIndicator() {
		return claimReportingIndicator;
	}

	public void setClaimReportingIndicator(Integer claimReportingIndicator) {
		this.claimReportingIndicator = claimReportingIndicator;
	}

	public String getIndicatorTitle() {
		return indicatorTitle;
	}

	public void setIndicatorTitle(String indicatorTitle) {
		this.indicatorTitle = indicatorTitle;
	}
}