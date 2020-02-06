package org.hl7.fhir.convertors.conv10_40;

import org.hl7.fhir.convertors.VersionConvertor_10_40;
import org.hl7.fhir.exceptions.FHIRException;

public class RiskAssessment10_40 {

    public static org.hl7.fhir.dstu2.model.RiskAssessment convertRiskAssessment(org.hl7.fhir.r4.model.RiskAssessment src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.RiskAssessment tgt = new org.hl7.fhir.dstu2.model.RiskAssessment();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        if (src.hasSubject()) {
            tgt.setSubject(VersionConvertor_10_40.convertReference(src.getSubject()));
        }
        if (src.hasCondition()) {
            tgt.setCondition(VersionConvertor_10_40.convertReference(src.getCondition()));
        }
        if (src.hasEncounter()) {
            tgt.setEncounter(VersionConvertor_10_40.convertReference(src.getEncounter()));
        }
        if (src.hasPerformer()) {
            tgt.setPerformer(VersionConvertor_10_40.convertReference(src.getPerformer()));
        }
        if (src.hasIdentifier()) {
            tgt.setIdentifier(VersionConvertor_10_40.convertIdentifier(src.getIdentifierFirstRep()));
        }
        if (src.hasMethod()) {
            tgt.setMethod(VersionConvertor_10_40.convertCodeableConcept(src.getMethod()));
        }
        if (src.hasBasis()) {
            for (org.hl7.fhir.r4.model.Reference t : src.getBasis()) tgt.addBasis(VersionConvertor_10_40.convertReference(t));
        }
        if (src.hasPrediction()) {
            for (org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent t : src.getPrediction()) tgt.addPrediction(convertRiskAssessmentPredictionComponent(t));
        }
        if (src.hasMitigation()) {
            tgt.setMitigation(src.getMitigation());
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.RiskAssessment convertRiskAssessment(org.hl7.fhir.dstu2.model.RiskAssessment src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.RiskAssessment tgt = new org.hl7.fhir.r4.model.RiskAssessment();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        if (src.hasSubject()) {
            tgt.setSubject(VersionConvertor_10_40.convertReference(src.getSubject()));
        }
        if (src.hasCondition()) {
            tgt.setCondition(VersionConvertor_10_40.convertReference(src.getCondition()));
        }
        if (src.hasEncounter()) {
            tgt.setEncounter(VersionConvertor_10_40.convertReference(src.getEncounter()));
        }
        if (src.hasPerformer()) {
            tgt.setPerformer(VersionConvertor_10_40.convertReference(src.getPerformer()));
        }
        if (src.hasIdentifier()) {
            tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(src.getIdentifier()));
        }
        if (src.hasMethod()) {
            tgt.setMethod(VersionConvertor_10_40.convertCodeableConcept(src.getMethod()));
        }
        if (src.hasBasis()) {
            for (org.hl7.fhir.dstu2.model.Reference t : src.getBasis()) tgt.addBasis(VersionConvertor_10_40.convertReference(t));
        }
        if (src.hasPrediction()) {
            for (org.hl7.fhir.dstu2.model.RiskAssessment.RiskAssessmentPredictionComponent t : src.getPrediction()) tgt.addPrediction(convertRiskAssessmentPredictionComponent(t));
        }
        if (src.hasMitigation()) {
            tgt.setMitigation(src.getMitigation());
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.RiskAssessment.RiskAssessmentPredictionComponent convertRiskAssessmentPredictionComponent(org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.RiskAssessment.RiskAssessmentPredictionComponent tgt = new org.hl7.fhir.dstu2.model.RiskAssessment.RiskAssessmentPredictionComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        if (src.hasOutcome()) {
            tgt.setOutcome(VersionConvertor_10_40.convertCodeableConcept(src.getOutcome()));
        }
        if (src.hasProbability()) {
            tgt.setProbability(VersionConvertor_10_40.convertType(src.getProbability()));
        }
        if (src.hasRelativeRisk()) {
            tgt.setRelativeRisk(src.getRelativeRisk());
        }
        if (src.hasWhen()) {
            tgt.setWhen(VersionConvertor_10_40.convertType(src.getWhen()));
        }
        if (src.hasRationale()) {
            tgt.setRationale(src.getRationale());
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent convertRiskAssessmentPredictionComponent(org.hl7.fhir.dstu2.model.RiskAssessment.RiskAssessmentPredictionComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent tgt = new org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        if (src.hasOutcome()) {
            tgt.setOutcome(VersionConvertor_10_40.convertCodeableConcept(src.getOutcome()));
        }
        if (src.hasProbability()) {
            tgt.setProbability(VersionConvertor_10_40.convertType(src.getProbability()));
        }
        if (src.hasRelativeRisk()) {
            tgt.setRelativeRisk(src.getRelativeRisk());
        }
        if (src.hasWhen()) {
            tgt.setWhen(VersionConvertor_10_40.convertType(src.getWhen()));
        }
        if (src.hasRationale()) {
            tgt.setRationale(src.getRationale());
        }
        return tgt;
    }
}
