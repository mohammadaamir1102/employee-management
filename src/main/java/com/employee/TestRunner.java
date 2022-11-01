//package com.employee;
//
//import java.io.FileReader;
//import java.util.Map;
//import java.util.Objects;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
//import com.fasterxml.jackson.annotation.PropertyAccessor;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.gson.Gson;
//import com.jayway.jsonpath.PathNotFoundException;
//import com.kli.epic.partyms.service.impl.PartyFatcaServiceImpl;
//import com.kli.epic.partyms.vo.BREInvocationResponse;
//import com.kli.epic.partyms.vo.NRIDerivationVO;
//import com.kli.epic.partyms.vo.ResponseVO;
//import com.kli.epic.partyms.vo.SourceSystemDataVO;
//
//import ch.qos.logback.classic.Logger;
//
//@Component
//public class TestRunner implements CommandLineRunner {
//    private static Logger logger = (Logger) LoggerFactory.getLogger(TestRunner.class.getPackage().getName());
//
//    @Value("${service.config.bre.nriDerivation.field-path}")
//    private String nriDeviationFieldPath;
//
//    @Autowired
//    private PartyFatcaServiceImpl partyFatcaServiceImpl;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        BREInvocationResponse breResponse = new BREInvocationResponse();
//
//        ResponseVO responseVO = new ResponseVO();
//        NRIDerivationVO nriDerivationVO = null;
//
//        SourceSystemDataVO sourceSystemDataVO = new SourceSystemDataVO();
//        sourceSystemDataVO.setProposalNo("05117985");
//
//        try {
//
//            JSONParser parser = new JSONParser();
//            Object obj = parser.parse(new FileReader("C:\\Users\\mindcraft\\JSONAAMResponse.json"));
//
//            JSONObject jsonObject = new JSONObject((Map) obj);
//
//            ObjectMapper objectMapper = new ObjectMapper();
//            objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
//            String breResponseJson = jsonObject.toString();
//            logger.info("/* BRE response received ::::::: {} ", breResponseJson);
//
//            JSONObject breJson = new JSONObject(breResponseJson);
//            logger.info(
//                    "------" + breJson.getJSONObject("Response").getJSONObject("blazeDecision").has("nriDerivation"));
//            logger.info(
//                    "------" + breJson.getJSONObject("Response").getJSONObject("blazeDecision").has("nriDerivation"));
//            if (!StringUtils.isEmpty(breResponseJson)
//                    && breJson.getJSONObject("Response").getJSONObject("blazeDecision").has("nriDerivation")) {
//                logger.info("/* nriDerivation node exist ");
//                logger.info("/* nriDeviationFieldPath---{} ", nriDeviationFieldPath);
//
//                String nriDerivation = breJson.getJSONObject("Response").getJSONObject("blazeDecision")
//                        .getJSONObject("nriDerivation").toString();
//                logger.info("/* nriDerivation : " + nriDerivation.toString());
//                nriDerivationVO = new Gson().fromJson(nriDerivation, NRIDerivationVO.class);
//                logger.info("/* nriDerivationVO :  {} */" , nriDerivationVO);
//
//
//            }
//
//            if (nriDerivationVO == null) {
//                logger.info("/* Set default value for NRI */");
//                nriDerivationVO = new NRIDerivationVO();
//                nriDerivationVO.setJointLifeNRI(null);
//                nriDerivationVO.setLifeAssuredNRI(null);
//                nriDerivationVO.setPayorNRI(null);
//                nriDerivationVO.setProposerNRI(null);
//            }
//
//        } catch (PathNotFoundException pnfe) {
//            logger.info("BRE response for NRI_FATCA call does not contain the node: nriDerivation for proposal no: {}",
//                    sourceSystemDataVO.getProposalNo());
//            logger.error(pnfe.getMessage(), pnfe);
//            pnfe.printStackTrace();
//        } catch (JsonProcessingException e) {
//            logger.info("Error parsing the BRE repsonse for NRI_FATCA call for proposal no: {}",
//                    sourceSystemDataVO.getProposalNo());
//            logger.error(e.getMessage(), e);
//            e.printStackTrace();
//        } catch (JSONException e) {
//            logger.info("Json Exception");
//            logger.info(e.getMessage(), e);
//            logger.error(e.getMessage(), e);
//            e.printStackTrace();
//        }
//
//        if (Objects.nonNull(nriDerivationVO)) {
//            logger.info("/* Nri Derivation : {} */", nriDerivationVO);
//            partyFatcaServiceImpl.persistNriFatcaForPartyRole(sourceSystemDataVO, nriDerivationVO);
//
//        }
//
//    }
//
//}
//
//
