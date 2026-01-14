package com.nailong.xt.data.load;

import com.nailong.xt.common.utils.DataUtils;
import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

/**
 * 自动生成的类
 */
@Component
@ToString
@RequiredArgsConstructor
@Slf4j
public class JsonDataAutoLoad {
    private final ObjectMapper objectMapper;
    private final GameDataMgr gameDataMgr;

    @PostConstruct
    public void autoLoadAllConfig() {
        Thread.startVirtualThread(() -> {
            long start = System.currentTimeMillis();

            File TowerDefenseGuideDataFile = DataUtils.getDataFile("TowerDefenseGuide");
            gameDataMgr.setTowerDefenseGuideConfigMap(objectMapper.readValue(TowerDefenseGuideDataFile, new TypeReference<>() {}));

            File ShieldDataFile = DataUtils.getDataFile("Shield");
            gameDataMgr.setShieldConfigMap(objectMapper.readValue(ShieldDataFile, new TypeReference<>() {}));

            File DropItemShowDataFile = DataUtils.getDataFile("DropItemShow");
            gameDataMgr.setDropItemShowConfigMap(objectMapper.readValue(DropItemShowDataFile, new TypeReference<>() {}));

            File ActivityDataFile = DataUtils.getDataFile("Activity");
            gameDataMgr.setActivityConfigMap(objectMapper.readValue(ActivityDataFile, new TypeReference<>() {}));

            File TowerDefenseCharacterDataFile = DataUtils.getDataFile("TowerDefenseCharacter");
            gameDataMgr.setTowerDefenseCharacterConfigMap(objectMapper.readValue(TowerDefenseCharacterDataFile, new TypeReference<>() {}));

            File AttributeSetLimitDataFile = DataUtils.getDataFile("AttributeSetLimit");
            gameDataMgr.setAttributeSetLimitConfigMap(objectMapper.readValue(AttributeSetLimitDataFile, new TypeReference<>() {}));

            File HandbookDataFile = DataUtils.getDataFile("Handbook");
            gameDataMgr.setHandbookConfigMap(objectMapper.readValue(HandbookDataFile, new TypeReference<>() {}));

            File StarTowerFloorExpDataFile = DataUtils.getDataFile("StarTowerFloorExp");
            gameDataMgr.setStarTowerFloorExpConfigMap(objectMapper.readValue(StarTowerFloorExpDataFile, new TypeReference<>() {}));

            File StoryPersonalityDataFile = DataUtils.getDataFile("StoryPersonality");
            gameDataMgr.setStoryPersonalityConfigMap(objectMapper.readValue(StoryPersonalityDataFile, new TypeReference<>() {}));

            File FormationSceneDataFile = DataUtils.getDataFile("FormationScene");
            gameDataMgr.setFormationSceneConfigMap(objectMapper.readValue(FormationSceneDataFile, new TypeReference<>() {}));

            File DatingLandmarkDataFile = DataUtils.getDataFile("DatingLandmark");
            gameDataMgr.setDatingLandmarkConfigMap(objectMapper.readValue(DatingLandmarkDataFile, new TypeReference<>() {}));

            File TravelerDuelChallengeDifficultyDataFile = DataUtils.getDataFile("TravelerDuelChallengeDifficulty");
            gameDataMgr.setTravelerDuelChallengeDifficultyConfigMap(objectMapper.readValue(TravelerDuelChallengeDifficultyDataFile, new TypeReference<>() {}));

            File CharacterTagDataFile = DataUtils.getDataFile("CharacterTag");
            gameDataMgr.setCharacterTagConfigMap(objectMapper.readValue(CharacterTagDataFile, new TypeReference<>() {}));

            File FactionRelationDataFile = DataUtils.getDataFile("FactionRelation");
            gameDataMgr.setFactionRelationConfigMap(objectMapper.readValue(FactionRelationDataFile, new TypeReference<>() {}));

            File AssistQuestGroupDataFile = DataUtils.getDataFile("AssistQuestGroup");
            gameDataMgr.setAssistQuestGroupConfigMap(objectMapper.readValue(AssistQuestGroupDataFile, new TypeReference<>() {}));

            File MonsterValueTempleteDataFile = DataUtils.getDataFile("MonsterValueTemplete");
            gameDataMgr.setMonsterValueTempleteConfigMap(objectMapper.readValue(MonsterValueTempleteDataFile, new TypeReference<>() {}));

            File ActivityGroupDataFile = DataUtils.getDataFile("ActivityGroup");
            gameDataMgr.setActivityGroupConfigMap(objectMapper.readValue(ActivityGroupDataFile, new TypeReference<>() {}));

            File CharacterSkinPanelFaceDataFile = DataUtils.getDataFile("CharacterSkinPanelFace");
            gameDataMgr.setCharacterSkinPanelFaceConfigMap(objectMapper.readValue(CharacterSkinPanelFaceDataFile, new TypeReference<>() {}));

            File BreakOutFloorDataFile = DataUtils.getDataFile("BreakOutFloor");
            gameDataMgr.setBreakOutFloorConfigMap(objectMapper.readValue(BreakOutFloorDataFile, new TypeReference<>() {}));

            File DatingCharResponseDataFile = DataUtils.getDataFile("DatingCharResponse");
            gameDataMgr.setDatingCharResponseConfigMap(objectMapper.readValue(DatingCharResponseDataFile, new TypeReference<>() {}));

            File MainlineFloorDataFile = DataUtils.getDataFile("MainlineFloor");
            gameDataMgr.setMainlineFloorConfigMap(objectMapper.readValue(MainlineFloorDataFile, new TypeReference<>() {}));

            File StoryDataFile = DataUtils.getDataFile("Story");
            gameDataMgr.setStoryConfigMap(objectMapper.readValue(StoryDataFile, new TypeReference<>() {}));

            File VampireEnemyPoolDataFile = DataUtils.getDataFile("VampireEnemyPool");
            gameDataMgr.setVampireEnemyPoolConfigMap(objectMapper.readValue(VampireEnemyPoolDataFile, new TypeReference<>() {}));

            File BdConvertContentDataFile = DataUtils.getDataFile("BdConvertContent");
            gameDataMgr.setBdConvertContentConfigMap(objectMapper.readValue(BdConvertContentDataFile, new TypeReference<>() {}));

            File TravelerDuelChallengeQuestDataFile = DataUtils.getDataFile("TravelerDuelChallengeQuest");
            gameDataMgr.setTravelerDuelChallengeQuestConfigMap(objectMapper.readValue(TravelerDuelChallengeQuestDataFile, new TypeReference<>() {}));

            File ActivityShopDataFile = DataUtils.getDataFile("ActivityShop");
            gameDataMgr.setActivityShopConfigMap(objectMapper.readValue(ActivityShopDataFile, new TypeReference<>() {}));

            File AffinityLevelDataFile = DataUtils.getDataFile("AffinityLevel");
            gameDataMgr.setAffinityLevelConfigMap(objectMapper.readValue(AffinityLevelDataFile, new TypeReference<>() {}));

            File ScoreBossFloorDataFile = DataUtils.getDataFile("ScoreBossFloor");
            gameDataMgr.setScoreBossFloorConfigMap(objectMapper.readValue(ScoreBossFloorDataFile, new TypeReference<>() {}));

            File ScoreGetSwitchDataFile = DataUtils.getDataFile("ScoreGetSwitch");
            gameDataMgr.setScoreGetSwitchConfigMap(objectMapper.readValue(ScoreGetSwitchDataFile, new TypeReference<>() {}));

            File StarTowerBookFateCardBundleDataFile = DataUtils.getDataFile("StarTowerBookFateCardBundle");
            gameDataMgr.setStarTowerBookFateCardBundleConfigMap(objectMapper.readValue(StarTowerBookFateCardBundleDataFile, new TypeReference<>() {}));

            File CharGemInstanceTypeDataFile = DataUtils.getDataFile("CharGemInstanceType");
            gameDataMgr.setCharGemInstanceTypeConfigMap(objectMapper.readValue(CharGemInstanceTypeDataFile, new TypeReference<>() {}));

            File GachaNewbieDataFile = DataUtils.getDataFile("GachaNewbie");
            gameDataMgr.setGachaNewbieConfigMap(objectMapper.readValue(GachaNewbieDataFile, new TypeReference<>() {}));

            File DiscPromoteDataFile = DataUtils.getDataFile("DiscPromote");
            gameDataMgr.setDiscPromoteConfigMap(objectMapper.readValue(DiscPromoteDataFile, new TypeReference<>() {}));

            File BattlePassDataFile = DataUtils.getDataFile("BattlePass");
            gameDataMgr.setBattlePassConfigMap(objectMapper.readValue(BattlePassDataFile, new TypeReference<>() {}));

            File BattleThresholdDataFile = DataUtils.getDataFile("BattleThreshold");
            gameDataMgr.setBattleThresholdConfigMap(objectMapper.readValue(BattleThresholdDataFile, new TypeReference<>() {}));

            File MonthlyCardDataFile = DataUtils.getDataFile("MonthlyCard");
            gameDataMgr.setMonthlyCardConfigMap(objectMapper.readValue(MonthlyCardDataFile, new TypeReference<>() {}));

            File BdConvertRewardGroupDataFile = DataUtils.getDataFile("BdConvertRewardGroup");
            gameDataMgr.setBdConvertRewardGroupConfigMap(objectMapper.readValue(BdConvertRewardGroupDataFile, new TypeReference<>() {}));

            File ScoreBossGetControlDataFile = DataUtils.getDataFile("ScoreBossGetControl");
            gameDataMgr.setScoreBossGetControlConfigMap(objectMapper.readValue(ScoreBossGetControlDataFile, new TypeReference<>() {}));

            File ActivityStoryDataFile = DataUtils.getDataFile("ActivityStory");
            gameDataMgr.setActivityStoryConfigMap(objectMapper.readValue(ActivityStoryDataFile, new TypeReference<>() {}));

            File MainSkillDataFile = DataUtils.getDataFile("MainSkill");
            gameDataMgr.setMainSkillConfigMap(objectMapper.readValue(MainSkillDataFile, new TypeReference<>() {}));

            File PopUpDataFile = DataUtils.getDataFile("PopUp");
            gameDataMgr.setPopUpConfigMap(objectMapper.readValue(PopUpDataFile, new TypeReference<>() {}));

            File ProduceHelperDataFile = DataUtils.getDataFile("ProduceHelper");
            gameDataMgr.setProduceHelperConfigMap(objectMapper.readValue(ProduceHelperDataFile, new TypeReference<>() {}));

            File StarTowerTalkDataFile = DataUtils.getDataFile("StarTowerTalk");
            gameDataMgr.setStarTowerTalkConfigMap(objectMapper.readValue(StarTowerTalkDataFile, new TypeReference<>() {}));

            File EffectDataFile = DataUtils.getDataFile("Effect");
            gameDataMgr.setEffectConfigMap(objectMapper.readValue(EffectDataFile, new TypeReference<>() {}));

            File StarTowerBookPotentialRewardDataFile = DataUtils.getDataFile("StarTowerBookPotentialReward");
            gameDataMgr.setStarTowerBookPotentialRewardConfigMap(objectMapper.readValue(StarTowerBookPotentialRewardDataFile, new TypeReference<>() {}));

            File CookieControlDataFile = DataUtils.getDataFile("CookieControl");
            gameDataMgr.setCookieControlConfigMap(objectMapper.readValue(CookieControlDataFile, new TypeReference<>() {}));

            File DropPkgDataFile = DataUtils.getDataFile("DropPkg");
            gameDataMgr.setDropPkgConfigMap(objectMapper.readValue(DropPkgDataFile, new TypeReference<>() {}));

            File StoryChapterTimeStampDataFile = DataUtils.getDataFile("StoryChapterTimeStamp");
            gameDataMgr.setStoryChapterTimeStampConfigMap(objectMapper.readValue(StoryChapterTimeStampDataFile, new TypeReference<>() {}));

            File AgentSpecialPerformanceDataFile = DataUtils.getDataFile("AgentSpecialPerformance");
            gameDataMgr.setAgentSpecialPerformanceConfigMap(objectMapper.readValue(AgentSpecialPerformanceDataFile, new TypeReference<>() {}));

            File HitDamageDataFile = DataUtils.getDataFile("HitDamage");
            gameDataMgr.setHitDamageConfigMap(objectMapper.readValue(HitDamageDataFile, new TypeReference<>() {}));

            File TalentGroupDataFile = DataUtils.getDataFile("TalentGroup");
            gameDataMgr.setTalentGroupConfigMap(objectMapper.readValue(TalentGroupDataFile, new TypeReference<>() {}));

            File AttributeDataFile = DataUtils.getDataFile("Attribute");
            gameDataMgr.setAttributeConfigMap(objectMapper.readValue(AttributeDataFile, new TypeReference<>() {}));

            File InfinityTowerBountyLevelDataFile = DataUtils.getDataFile("InfinityTowerBountyLevel");
            gameDataMgr.setInfinityTowerBountyLevelConfigMap(objectMapper.readValue(InfinityTowerBountyLevelDataFile, new TypeReference<>() {}));

            File JointDrillRankDataFile = DataUtils.getDataFile("JointDrillRank");
            gameDataMgr.setJointDrillRankConfigMap(objectMapper.readValue(JointDrillRankDataFile, new TypeReference<>() {}));

            File AiDataFile = DataUtils.getDataFile("Ai");
            gameDataMgr.setAiConfigMap(objectMapper.readValue(AiDataFile, new TypeReference<>() {}));

            File OnceAdditionalAttributeDataFile = DataUtils.getDataFile("OnceAdditionalAttribute");
            gameDataMgr.setOnceAdditionalAttributeConfigMap(objectMapper.readValue(OnceAdditionalAttributeDataFile, new TypeReference<>() {}));

            File TourGuideQuestDataFile = DataUtils.getDataFile("TourGuideQuest");
            gameDataMgr.setTourGuideQuestConfigMap(objectMapper.readValue(TourGuideQuestDataFile, new TypeReference<>() {}));

            File StarTowerGroupDataFile = DataUtils.getDataFile("StarTowerGroup");
            gameDataMgr.setStarTowerGroupConfigMap(objectMapper.readValue(StarTowerGroupDataFile, new TypeReference<>() {}));

            File StarTowerSpModeDataFile = DataUtils.getDataFile("StarTowerSpMode");
            gameDataMgr.setStarTowerSpModeConfigMap(objectMapper.readValue(StarTowerSpModeDataFile, new TypeReference<>() {}));

            File TrialBuildDataFile = DataUtils.getDataFile("TrialBuild");
            gameDataMgr.setTrialBuildConfigMap(objectMapper.readValue(TrialBuildDataFile, new TypeReference<>() {}));

            File MiningControlDataFile = DataUtils.getDataFile("MiningControl");
            gameDataMgr.setMiningControlConfigMap(objectMapper.readValue(MiningControlDataFile, new TypeReference<>() {}));

            File ScoreBossStarDataFile = DataUtils.getDataFile("ScoreBossStar");
            gameDataMgr.setScoreBossStarConfigMap(objectMapper.readValue(ScoreBossStarDataFile, new TypeReference<>() {}));

            File TowerDefenseControlDataFile = DataUtils.getDataFile("TowerDefenseControl");
            gameDataMgr.setTowerDefenseControlConfigMap(objectMapper.readValue(TowerDefenseControlDataFile, new TypeReference<>() {}));

            File MailTemplateDataFile = DataUtils.getDataFile("MailTemplate");
            gameDataMgr.setMailTemplateConfigMap(objectMapper.readValue(MailTemplateDataFile, new TypeReference<>() {}));

            File TravelerDuelChallengeAffixDataFile = DataUtils.getDataFile("TravelerDuelChallengeAffix");
            gameDataMgr.setTravelerDuelChallengeAffixConfigMap(objectMapper.readValue(TravelerDuelChallengeAffixDataFile, new TypeReference<>() {}));

            File TowerDefenseItemDataFile = DataUtils.getDataFile("TowerDefenseItem");
            gameDataMgr.setTowerDefenseItemConfigMap(objectMapper.readValue(TowerDefenseItemDataFile, new TypeReference<>() {}));

            File TrialPotentialDataFile = DataUtils.getDataFile("TrialPotential");
            gameDataMgr.setTrialPotentialConfigMap(objectMapper.readValue(TrialPotentialDataFile, new TypeReference<>() {}));

            File AssistAttributeDataFile = DataUtils.getDataFile("AssistAttribute");
            gameDataMgr.setAssistAttributeConfigMap(objectMapper.readValue(AssistAttributeDataFile, new TypeReference<>() {}));

            File SubNoteSkillDropGroupDataFile = DataUtils.getDataFile("SubNoteSkillDropGroup");
            gameDataMgr.setSubNoteSkillDropGroupConfigMap(objectMapper.readValue(SubNoteSkillDropGroupDataFile, new TypeReference<>() {}));

            File HonorDataFile = DataUtils.getDataFile("Honor");
            gameDataMgr.setHonorConfigMap(objectMapper.readValue(HonorDataFile, new TypeReference<>() {}));

            File StarTowerEventDataFile = DataUtils.getDataFile("StarTowerEvent");
            gameDataMgr.setStarTowerEventConfigMap(objectMapper.readValue(StarTowerEventDataFile, new TypeReference<>() {}));

            File BdConvertConditionDataFile = DataUtils.getDataFile("BdConvertCondition");
            gameDataMgr.setBdConvertConditionConfigMap(objectMapper.readValue(BdConvertConditionDataFile, new TypeReference<>() {}));

            File StarTowerScenePrefabDataFile = DataUtils.getDataFile("StarTowerScenePrefab");
            gameDataMgr.setStarTowerScenePrefabConfigMap(objectMapper.readValue(StarTowerScenePrefabDataFile, new TypeReference<>() {}));

            File WeekBossFloorDataFile = DataUtils.getDataFile("WeekBossFloor");
            gameDataMgr.setWeekBossFloorConfigMap(objectMapper.readValue(WeekBossFloorDataFile, new TypeReference<>() {}));

            File GuideGroupDataFile = DataUtils.getDataFile("GuideGroup");
            gameDataMgr.setGuideGroupConfigMap(objectMapper.readValue(GuideGroupDataFile, new TypeReference<>() {}));

            File RegionBossAffixDataFile = DataUtils.getDataFile("RegionBossAffix");
            gameDataMgr.setRegionBossAffixConfigMap(objectMapper.readValue(RegionBossAffixDataFile, new TypeReference<>() {}));

            File NpcConfigDataFile = DataUtils.getDataFile("NpcConfig");
            gameDataMgr.setNpcConfigConfigMap(objectMapper.readValue(NpcConfigDataFile, new TypeReference<>() {}));

            File MiningSupportDataFile = DataUtils.getDataFile("MiningSupport");
            gameDataMgr.setMiningSupportConfigMap(objectMapper.readValue(MiningSupportDataFile, new TypeReference<>() {}));

            File RankDataFile = DataUtils.getDataFile("Rank");
            gameDataMgr.setRankConfigMap(objectMapper.readValue(RankDataFile, new TypeReference<>() {}));

            File TourGuideQuestGroupDataFile = DataUtils.getDataFile("TourGuideQuestGroup");
            gameDataMgr.setTourGuideQuestGroupConfigMap(objectMapper.readValue(TourGuideQuestGroupDataFile, new TypeReference<>() {}));

            File BuffDataFile = DataUtils.getDataFile("Buff");
            gameDataMgr.setBuffConfigMap(objectMapper.readValue(BuffDataFile, new TypeReference<>() {}));

            File CharGemInstanceDataFile = DataUtils.getDataFile("CharGemInstance");
            gameDataMgr.setCharGemInstanceConfigMap(objectMapper.readValue(CharGemInstanceDataFile, new TypeReference<>() {}));

            File GachaATypeProbDataFile = DataUtils.getDataFile("GachaATypeProb");
            gameDataMgr.setGachaATypeProbConfigMap(objectMapper.readValue(GachaATypeProbDataFile, new TypeReference<>() {}));

            File ScoreBossRankDataFile = DataUtils.getDataFile("ScoreBossRank");
            gameDataMgr.setScoreBossRankConfigMap(objectMapper.readValue(ScoreBossRankDataFile, new TypeReference<>() {}));

            File EventResultDataFile = DataUtils.getDataFile("EventResult");
            gameDataMgr.setEventResultConfigMap(objectMapper.readValue(EventResultDataFile, new TypeReference<>() {}));

            File StarTowerMonsterSpAttrDataFile = DataUtils.getDataFile("StarTowerMonsterSpAttr");
            gameDataMgr.setStarTowerMonsterSpAttrConfigMap(objectMapper.readValue(StarTowerMonsterSpAttrDataFile, new TypeReference<>() {}));

            File TravelerDuelBossDataFile = DataUtils.getDataFile("TravelerDuelBoss");
            gameDataMgr.setTravelerDuelBossConfigMap(objectMapper.readValue(TravelerDuelBossDataFile, new TypeReference<>() {}));

            File SignInDataFile = DataUtils.getDataFile("SignIn");
            gameDataMgr.setSignInConfigMap(objectMapper.readValue(SignInDataFile, new TypeReference<>() {}));

            File CharacterArchiveVoiceDataFile = DataUtils.getDataFile("CharacterArchiveVoice");
            gameDataMgr.setCharacterArchiveVoiceConfigMap(objectMapper.readValue(CharacterArchiveVoiceDataFile, new TypeReference<>() {}));

            File DropObjectGroupDataFile = DataUtils.getDataFile("DropObjectGroup");
            gameDataMgr.setDropObjectGroupConfigMap(objectMapper.readValue(DropObjectGroupDataFile, new TypeReference<>() {}));

            File MonsterTeamDataFile = DataUtils.getDataFile("MonsterTeam");
            gameDataMgr.setMonsterTeamConfigMap(objectMapper.readValue(MonsterTeamDataFile, new TypeReference<>() {}));

            File DailyInstanceDataFile = DataUtils.getDataFile("DailyInstance");
            gameDataMgr.setDailyInstanceConfigMap(objectMapper.readValue(DailyInstanceDataFile, new TypeReference<>() {}));

            File StarTowerQuestDataFile = DataUtils.getDataFile("StarTowerQuest");
            gameDataMgr.setStarTowerQuestConfigMap(objectMapper.readValue(StarTowerQuestDataFile, new TypeReference<>() {}));

            File StorySetChapterDataFile = DataUtils.getDataFile("StorySetChapter");
            gameDataMgr.setStorySetChapterConfigMap(objectMapper.readValue(StorySetChapterDataFile, new TypeReference<>() {}));

            File RegionBossDataFile = DataUtils.getDataFile("RegionBoss");
            gameDataMgr.setRegionBossConfigMap(objectMapper.readValue(RegionBossDataFile, new TypeReference<>() {}));

            File StoryChapterDataFile = DataUtils.getDataFile("StoryChapter");
            gameDataMgr.setStoryChapterConfigMap(objectMapper.readValue(StoryChapterDataFile, new TypeReference<>() {}));

            File NpcAffinityPlotDataFile = DataUtils.getDataFile("NpcAffinityPlot");
            gameDataMgr.setNpcAffinityPlotConfigMap(objectMapper.readValue(NpcAffinityPlotDataFile, new TypeReference<>() {}));

            File CharItemExpDataFile = DataUtils.getDataFile("CharItemExp");
            gameDataMgr.setCharItemExpConfigMap(objectMapper.readValue(CharItemExpDataFile, new TypeReference<>() {}));

            File SecondarySkillDataFile = DataUtils.getDataFile("SecondarySkill");
            gameDataMgr.setSecondarySkillConfigMap(objectMapper.readValue(SecondarySkillDataFile, new TypeReference<>() {}));

            File GachaPkgDataFile = DataUtils.getDataFile("GachaPkg");
            gameDataMgr.setGachaPkgConfigMap(objectMapper.readValue(GachaPkgDataFile, new TypeReference<>() {}));

            File MiningDemoConfigDataFile = DataUtils.getDataFile("MiningDemoConfig");
            gameDataMgr.setMiningDemoConfigConfigMap(objectMapper.readValue(MiningDemoConfigDataFile, new TypeReference<>() {}));

            File WeekBossAffixDataFile = DataUtils.getDataFile("WeekBossAffix");
            gameDataMgr.setWeekBossAffixConfigMap(objectMapper.readValue(WeekBossAffixDataFile, new TypeReference<>() {}));

            File MallGemDataFile = DataUtils.getDataFile("MallGem");
            gameDataMgr.setMallGemConfigMap(objectMapper.readValue(MallGemDataFile, new TypeReference<>() {}));

            File ProductionTypeDataFile = DataUtils.getDataFile("ProductionType");
            gameDataMgr.setProductionTypeConfigMap(objectMapper.readValue(ProductionTypeDataFile, new TypeReference<>() {}));

            File TestCharacterListDataFile = DataUtils.getDataFile("TestCharacterList");
            gameDataMgr.setTestCharacterListConfigMap(objectMapper.readValue(TestCharacterListDataFile, new TypeReference<>() {}));

            File DropObjectDataFile = DataUtils.getDataFile("DropObject");
            gameDataMgr.setDropObjectConfigMap(objectMapper.readValue(DropObjectDataFile, new TypeReference<>() {}));

            File DictionaryEntryDataFile = DataUtils.getDataFile("DictionaryEntry");
            gameDataMgr.setDictionaryEntryConfigMap(objectMapper.readValue(DictionaryEntryDataFile, new TypeReference<>() {}));

            File AffinityUpRewardDataFile = DataUtils.getDataFile("AffinityUpReward");
            gameDataMgr.setAffinityUpRewardConfigMap(objectMapper.readValue(AffinityUpRewardDataFile, new TypeReference<>() {}));

            File StarTowerEnemySetDataFile = DataUtils.getDataFile("StarTowerEnemySet");
            gameDataMgr.setStarTowerEnemySetConfigMap(objectMapper.readValue(StarTowerEnemySetDataFile, new TypeReference<>() {}));

            File TrialControlDataFile = DataUtils.getDataFile("TrialControl");
            gameDataMgr.setTrialControlConfigMap(objectMapper.readValue(TrialControlDataFile, new TypeReference<>() {}));

            File VampireSurvivorQuestDataFile = DataUtils.getDataFile("VampireSurvivorQuest");
            gameDataMgr.setVampireSurvivorQuestConfigMap(objectMapper.readValue(VampireSurvivorQuestDataFile, new TypeReference<>() {}));

            File ScriptParameterDataFile = DataUtils.getDataFile("ScriptParameter");
            gameDataMgr.setScriptParameterConfigMap(objectMapper.readValue(ScriptParameterDataFile, new TypeReference<>() {}));

            File TestTeamDataDataFile = DataUtils.getDataFile("TestTeamData");
            gameDataMgr.setTestTeamDataConfigMap(objectMapper.readValue(TestTeamDataDataFile, new TypeReference<>() {}));

            File AchievementDataFile = DataUtils.getDataFile("Achievement");
            gameDataMgr.setAchievementConfigMap(objectMapper.readValue(AchievementDataFile, new TypeReference<>() {}));

            File ScriptParameterValueDataFile = DataUtils.getDataFile("ScriptParameterValue");
            gameDataMgr.setScriptParameterValueConfigMap(objectMapper.readValue(ScriptParameterValueDataFile, new TypeReference<>() {}));

            File CookiePackagePathsGroupDataFile = DataUtils.getDataFile("CookiePackagePathsGroup");
            gameDataMgr.setCookiePackagePathsGroupConfigMap(objectMapper.readValue(CookiePackagePathsGroupDataFile, new TypeReference<>() {}));

            File JointDrillLevelDataFile = DataUtils.getDataFile("JointDrillLevel");
            gameDataMgr.setJointDrillLevelConfigMap(objectMapper.readValue(JointDrillLevelDataFile, new TypeReference<>() {}));

            File CharacterUpgradeDataFile = DataUtils.getDataFile("CharacterUpgrade");
            gameDataMgr.setCharacterUpgradeConfigMap(objectMapper.readValue(CharacterUpgradeDataFile, new TypeReference<>() {}));

            File HtmlConfigDataFile = DataUtils.getDataFile("HtmlConfig");
            gameDataMgr.setHtmlConfigConfigMap(objectMapper.readValue(HtmlConfigDataFile, new TypeReference<>() {}));

            File CharGemAttrValueDataFile = DataUtils.getDataFile("CharGemAttrValue");
            gameDataMgr.setCharGemAttrValueConfigMap(objectMapper.readValue(CharGemAttrValueDataFile, new TypeReference<>() {}));

            File TowerDefenceCharacterAiDataFile = DataUtils.getDataFile("TowerDefenceCharacterAi");
            gameDataMgr.setTowerDefenceCharacterAiConfigMap(objectMapper.readValue(TowerDefenceCharacterAiDataFile, new TypeReference<>() {}));

            File InfinityTowerMapDataFile = DataUtils.getDataFile("InfinityTowerMap");
            gameDataMgr.setInfinityTowerMapConfigMap(objectMapper.readValue(InfinityTowerMapDataFile, new TypeReference<>() {}));

            File DatingCharacterEventDataFile = DataUtils.getDataFile("DatingCharacterEvent");
            gameDataMgr.setDatingCharacterEventConfigMap(objectMapper.readValue(DatingCharacterEventDataFile, new TypeReference<>() {}));

            File ActivityStoryConditionDataFile = DataUtils.getDataFile("ActivityStoryCondition");
            gameDataMgr.setActivityStoryConditionConfigMap(objectMapper.readValue(ActivityStoryConditionDataFile, new TypeReference<>() {}));

            File ActivityLevelsFloorDataFile = DataUtils.getDataFile("ActivityLevelsFloor");
            gameDataMgr.setActivityLevelsFloorConfigMap(objectMapper.readValue(ActivityLevelsFloorDataFile, new TypeReference<>() {}));

            File StarTowerNpcDataFile = DataUtils.getDataFile("StarTowerNpc");
            gameDataMgr.setStarTowerNpcConfigMap(objectMapper.readValue(StarTowerNpcDataFile, new TypeReference<>() {}));

            File CookieFloorDataFile = DataUtils.getDataFile("CookieFloor");
            gameDataMgr.setCookieFloorConfigMap(objectMapper.readValue(CookieFloorDataFile, new TypeReference<>() {}));

            File VampireSurvivorLevelDataFile = DataUtils.getDataFile("VampireSurvivorLevel");
            gameDataMgr.setVampireSurvivorLevelConfigMap(objectMapper.readValue(VampireSurvivorLevelDataFile, new TypeReference<>() {}));

            File GmSupermanDataFile = DataUtils.getDataFile("GmSuperman");
            gameDataMgr.setGmSupermanConfigMap(objectMapper.readValue(GmSupermanDataFile, new TypeReference<>() {}));

            File TrialGroupDataFile = DataUtils.getDataFile("TrialGroup");
            gameDataMgr.setTrialGroupConfigMap(objectMapper.readValue(TrialGroupDataFile, new TypeReference<>() {}));

            File WeekBossLevelDataFile = DataUtils.getDataFile("WeekBossLevel");
            gameDataMgr.setWeekBossLevelConfigMap(objectMapper.readValue(WeekBossLevelDataFile, new TypeReference<>() {}));

            File GmBuildDataFile = DataUtils.getDataFile("GmBuild");
            gameDataMgr.setGmBuildConfigMap(objectMapper.readValue(GmBuildDataFile, new TypeReference<>() {}));

            File CharGemDataFile = DataUtils.getDataFile("CharGem");
            gameDataMgr.setCharGemConfigMap(objectMapper.readValue(CharGemDataFile, new TypeReference<>() {}));

            File ResidentGoodsDataFile = DataUtils.getDataFile("ResidentGoods");
            gameDataMgr.setResidentGoodsConfigMap(objectMapper.readValue(ResidentGoodsDataFile, new TypeReference<>() {}));

            File CharAffinityTemplateDataFile = DataUtils.getDataFile("CharAffinityTemplate");
            gameDataMgr.setCharAffinityTemplateConfigMap(objectMapper.readValue(CharAffinityTemplateDataFile, new TypeReference<>() {}));

            File TowerDefenseQuestDataFile = DataUtils.getDataFile("TowerDefenseQuest");
            gameDataMgr.setTowerDefenseQuestConfigMap(objectMapper.readValue(TowerDefenseQuestDataFile, new TypeReference<>() {}));

            File MangaLoadingDataFile = DataUtils.getDataFile("MangaLoading");
            gameDataMgr.setMangaLoadingConfigMap(objectMapper.readValue(MangaLoadingDataFile, new TypeReference<>() {}));

            File CookieLevelDataFile = DataUtils.getDataFile("CookieLevel");
            gameDataMgr.setCookieLevelConfigMap(objectMapper.readValue(CookieLevelDataFile, new TypeReference<>() {}));

            File GuideDataFile = DataUtils.getDataFile("Guide");
            gameDataMgr.setGuideConfigMap(objectMapper.readValue(GuideDataFile, new TypeReference<>() {}));

            File ForceDataFile = DataUtils.getDataFile("Force");
            gameDataMgr.setForceConfigMap(objectMapper.readValue(ForceDataFile, new TypeReference<>() {}));

            File StarTowerFloorSetDataFile = DataUtils.getDataFile("StarTowerFloorSet");
            gameDataMgr.setStarTowerFloorSetConfigMap(objectMapper.readValue(StarTowerFloorSetDataFile, new TypeReference<>() {}));

            File TutorialLevelDataFile = DataUtils.getDataFile("TutorialLevel");
            gameDataMgr.setTutorialLevelConfigMap(objectMapper.readValue(TutorialLevelDataFile, new TypeReference<>() {}));

            File ActivityStoryEvidenceDataFile = DataUtils.getDataFile("ActivityStoryEvidence");
            gameDataMgr.setActivityStoryEvidenceConfigMap(objectMapper.readValue(ActivityStoryEvidenceDataFile, new TypeReference<>() {}));

            File CharacterSkinDataFile = DataUtils.getDataFile("CharacterSkin");
            gameDataMgr.setCharacterSkinConfigMap(objectMapper.readValue(CharacterSkinDataFile, new TypeReference<>() {}));

            File DestroyObjectSprDataFile = DataUtils.getDataFile("DestroyObjectSpr");
            gameDataMgr.setDestroyObjectSprConfigMap(objectMapper.readValue(DestroyObjectSprDataFile, new TypeReference<>() {}));

            File EnergyBuyDataFile = DataUtils.getDataFile("EnergyBuy");
            gameDataMgr.setEnergyBuyConfigMap(objectMapper.readValue(EnergyBuyDataFile, new TypeReference<>() {}));

            File TowerDefenseLevelDataFile = DataUtils.getDataFile("TowerDefenseLevel");
            gameDataMgr.setTowerDefenseLevelConfigMap(objectMapper.readValue(TowerDefenseLevelDataFile, new TypeReference<>() {}));

            File PreviewMonsterGroupDataFile = DataUtils.getDataFile("PreviewMonsterGroup");
            gameDataMgr.setPreviewMonsterGroupConfigMap(objectMapper.readValue(PreviewMonsterGroupDataFile, new TypeReference<>() {}));

            File MallShopPageDataFile = DataUtils.getDataFile("MallShopPage");
            gameDataMgr.setMallShopPageConfigMap(objectMapper.readValue(MallShopPageDataFile, new TypeReference<>() {}));

            File DatingStartEndEventDataFile = DataUtils.getDataFile("DatingStartEndEvent");
            gameDataMgr.setDatingStartEndEventConfigMap(objectMapper.readValue(DatingStartEndEventDataFile, new TypeReference<>() {}));

            File ActivityStoryChapterDataFile = DataUtils.getDataFile("ActivityStoryChapter");
            gameDataMgr.setActivityStoryChapterConfigMap(objectMapper.readValue(ActivityStoryChapterDataFile, new TypeReference<>() {}));

            File DictionaryDiagramDataFile = DataUtils.getDataFile("DictionaryDiagram");
            gameDataMgr.setDictionaryDiagramConfigMap(objectMapper.readValue(DictionaryDiagramDataFile, new TypeReference<>() {}));

            File SkillInstanceFloorDataFile = DataUtils.getDataFile("SkillInstanceFloor");
            gameDataMgr.setSkillInstanceFloorConfigMap(objectMapper.readValue(SkillInstanceFloorDataFile, new TypeReference<>() {}));

            File BuffEffectDataFile = DataUtils.getDataFile("BuffEffect");
            gameDataMgr.setBuffEffectConfigMap(objectMapper.readValue(BuffEffectDataFile, new TypeReference<>() {}));

            File AttributeLimitDataFile = DataUtils.getDataFile("AttributeLimit");
            gameDataMgr.setAttributeLimitConfigMap(objectMapper.readValue(AttributeLimitDataFile, new TypeReference<>() {}));

            File DailyInstanceFloorDataFile = DataUtils.getDataFile("DailyInstanceFloor");
            gameDataMgr.setDailyInstanceFloorConfigMap(objectMapper.readValue(DailyInstanceFloorDataFile, new TypeReference<>() {}));

            File PeriodicQuestGroupDataFile = DataUtils.getDataFile("PeriodicQuestGroup");
            gameDataMgr.setPeriodicQuestGroupConfigMap(objectMapper.readValue(PeriodicQuestGroupDataFile, new TypeReference<>() {}));

            File CookieRhythmlResultDataFile = DataUtils.getDataFile("CookieRhythmlResult");
            gameDataMgr.setCookieRhythmlResultConfigMap(objectMapper.readValue(CookieRhythmlResultDataFile, new TypeReference<>() {}));

            File CharacterArchiveDataFile = DataUtils.getDataFile("CharacterArchive");
            gameDataMgr.setCharacterArchiveConfigMap(objectMapper.readValue(CharacterArchiveDataFile, new TypeReference<>() {}));

            File NpcAffinityGroupDataFile = DataUtils.getDataFile("NpcAffinityGroup");
            gameDataMgr.setNpcAffinityGroupConfigMap(objectMapper.readValue(NpcAffinityGroupDataFile, new TypeReference<>() {}));

            File InfinityTowerFloorDataFile = DataUtils.getDataFile("InfinityTowerFloor");
            gameDataMgr.setInfinityTowerFloorConfigMap(objectMapper.readValue(InfinityTowerFloorDataFile, new TypeReference<>() {}));

            File ActivityShopControlDataFile = DataUtils.getDataFile("ActivityShopControl");
            gameDataMgr.setActivityShopControlConfigMap(objectMapper.readValue(ActivityShopControlDataFile, new TypeReference<>() {}));

            File AdControlDataFile = DataUtils.getDataFile("AdControl");
            gameDataMgr.setAdControlConfigMap(objectMapper.readValue(AdControlDataFile, new TypeReference<>() {}));

            File InfinityTowerLevelDataFile = DataUtils.getDataFile("InfinityTowerLevel");
            gameDataMgr.setInfinityTowerLevelConfigMap(objectMapper.readValue(InfinityTowerLevelDataFile, new TypeReference<>() {}));

            File DiscExtraAttributeDataFile = DataUtils.getDataFile("DiscExtraAttribute");
            gameDataMgr.setDiscExtraAttributeConfigMap(objectMapper.readValue(DiscExtraAttributeDataFile, new TypeReference<>() {}));

            File GachaStorageDataFile = DataUtils.getDataFile("GachaStorage");
            gameDataMgr.setGachaStorageConfigMap(objectMapper.readValue(GachaStorageDataFile, new TypeReference<>() {}));

            File LoginRewardGroupDataFile = DataUtils.getDataFile("LoginRewardGroup");
            gameDataMgr.setLoginRewardGroupConfigMap(objectMapper.readValue(LoginRewardGroupDataFile, new TypeReference<>() {}));

            File AffinityGiftDataFile = DataUtils.getDataFile("AffinityGift");
            gameDataMgr.setAffinityGiftConfigMap(objectMapper.readValue(AffinityGiftDataFile, new TypeReference<>() {}));

            File WeeklyQuestActiveDataFile = DataUtils.getDataFile("WeeklyQuestActive");
            gameDataMgr.setWeeklyQuestActiveConfigMap(objectMapper.readValue(WeeklyQuestActiveDataFile, new TypeReference<>() {}));

            File TowerDefensePotentialDataFile = DataUtils.getDataFile("TowerDefensePotential");
            gameDataMgr.setTowerDefensePotentialConfigMap(objectMapper.readValue(TowerDefensePotentialDataFile, new TypeReference<>() {}));

            File ActivityTaskGroupDataFile = DataUtils.getDataFile("ActivityTaskGroup");
            gameDataMgr.setActivityTaskGroupConfigMap(objectMapper.readValue(ActivityTaskGroupDataFile, new TypeReference<>() {}));

            File LoginRewardControlDataFile = DataUtils.getDataFile("LoginRewardControl");
            gameDataMgr.setLoginRewardControlConfigMap(objectMapper.readValue(LoginRewardControlDataFile, new TypeReference<>() {}));

            File TitleDataFile = DataUtils.getDataFile("Title");
            gameDataMgr.setTitleConfigMap(objectMapper.readValue(TitleDataFile, new TypeReference<>() {}));

            File AssistQuestDataFile = DataUtils.getDataFile("AssistQuest");
            gameDataMgr.setAssistQuestConfigMap(objectMapper.readValue(AssistQuestDataFile, new TypeReference<>() {}));

            File DailyQuestAwardDataFile = DataUtils.getDataFile("DailyQuestAward");
            gameDataMgr.setDailyQuestAwardConfigMap(objectMapper.readValue(DailyQuestAwardDataFile, new TypeReference<>() {}));

            File TravelerDuelChallengeControlDataFile = DataUtils.getDataFile("TravelerDuelChallengeControl");
            gameDataMgr.setTravelerDuelChallengeControlConfigMap(objectMapper.readValue(TravelerDuelChallengeControlDataFile, new TypeReference<>() {}));

            File JointDrillQuestDataFile = DataUtils.getDataFile("JointDrillQuest");
            gameDataMgr.setJointDrillQuestConfigMap(objectMapper.readValue(JointDrillQuestDataFile, new TypeReference<>() {}));

            File MallPackageDataFile = DataUtils.getDataFile("MallPackage");
            gameDataMgr.setMallPackageConfigMap(objectMapper.readValue(MallPackageDataFile, new TypeReference<>() {}));

            File EffectDescDataFile = DataUtils.getDataFile("EffectDesc");
            gameDataMgr.setEffectDescConfigMap(objectMapper.readValue(EffectDescDataFile, new TypeReference<>() {}));

            File JointDrillAffixDataFile = DataUtils.getDataFile("JointDrillAffix");
            gameDataMgr.setJointDrillAffixConfigMap(objectMapper.readValue(JointDrillAffixDataFile, new TypeReference<>() {}));

            File GachaTypeDataFile = DataUtils.getDataFile("GachaType");
            gameDataMgr.setGachaTypeConfigMap(objectMapper.readValue(GachaTypeDataFile, new TypeReference<>() {}));

            File SkillDataFile = DataUtils.getDataFile("Skill");
            gameDataMgr.setSkillConfigMap(objectMapper.readValue(SkillDataFile, new TypeReference<>() {}));

            File MallPackagePageDataFile = DataUtils.getDataFile("MallPackagePage");
            gameDataMgr.setMallPackagePageConfigMap(objectMapper.readValue(MallPackagePageDataFile, new TypeReference<>() {}));

            File SkillInstanceTypeDataFile = DataUtils.getDataFile("SkillInstanceType");
            gameDataMgr.setSkillInstanceTypeConfigMap(objectMapper.readValue(SkillInstanceTypeDataFile, new TypeReference<>() {}));

            File InfinityTowerDataFile = DataUtils.getDataFile("InfinityTower");
            gameDataMgr.setInfinityTowerConfigMap(objectMapper.readValue(InfinityTowerDataFile, new TypeReference<>() {}));

            File SubNoteSkillPromoteGroupDataFile = DataUtils.getDataFile("SubNoteSkillPromoteGroup");
            gameDataMgr.setSubNoteSkillPromoteGroupConfigMap(objectMapper.readValue(SubNoteSkillPromoteGroupDataFile, new TypeReference<>() {}));

            File DictionaryTabDataFile = DataUtils.getDataFile("DictionaryTab");
            gameDataMgr.setDictionaryTabConfigMap(objectMapper.readValue(DictionaryTabDataFile, new TypeReference<>() {}));

            File CharacterVoiceControlDataFile = DataUtils.getDataFile("CharacterVoiceControl");
            gameDataMgr.setCharacterVoiceControlConfigMap(objectMapper.readValue(CharacterVoiceControlDataFile, new TypeReference<>() {}));

            File TowerDefenseTeamExpDataFile = DataUtils.getDataFile("TowerDefenseTeamExp");
            gameDataMgr.setTowerDefenseTeamExpConfigMap(objectMapper.readValue(TowerDefenseTeamExpDataFile, new TypeReference<>() {}));

            File UiTextDataFile = DataUtils.getDataFile("UiText");
            gameDataMgr.setUiTextConfigMap(objectMapper.readValue(UiTextDataFile, new TypeReference<>() {}));

            File ErrorCodeDataFile = DataUtils.getDataFile("ErrorCode");
            gameDataMgr.setErrorCodeConfigMap(objectMapper.readValue(ErrorCodeDataFile, new TypeReference<>() {}));

            File InfinityTowerDifficultyDataFile = DataUtils.getDataFile("InfinityTowerDifficulty");
            gameDataMgr.setInfinityTowerDifficultyConfigMap(objectMapper.readValue(InfinityTowerDifficultyDataFile, new TypeReference<>() {}));

            File StorySetSectionDataFile = DataUtils.getDataFile("StorySetSection");
            gameDataMgr.setStorySetSectionConfigMap(objectMapper.readValue(StorySetSectionDataFile, new TypeReference<>() {}));

            File BuffValueDataFile = DataUtils.getDataFile("BuffValue");
            gameDataMgr.setBuffValueConfigMap(objectMapper.readValue(BuffValueDataFile, new TypeReference<>() {}));

            File CharacterArchiveContentDataFile = DataUtils.getDataFile("CharacterArchiveContent");
            gameDataMgr.setCharacterArchiveContentConfigMap(objectMapper.readValue(CharacterArchiveContentDataFile, new TypeReference<>() {}));

            File ChestDataFile = DataUtils.getDataFile("Chest");
            gameDataMgr.setChestConfigMap(objectMapper.readValue(ChestDataFile, new TypeReference<>() {}));

            File NpcSkinDataFile = DataUtils.getDataFile("NpcSkin");
            gameDataMgr.setNpcSkinConfigMap(objectMapper.readValue(NpcSkinDataFile, new TypeReference<>() {}));

            File WordDataFile = DataUtils.getDataFile("Word");
            gameDataMgr.setWordConfigMap(objectMapper.readValue(WordDataFile, new TypeReference<>() {}));

            File FloorBuffDataFile = DataUtils.getDataFile("FloorBuff");
            gameDataMgr.setFloorBuffConfigMap(objectMapper.readValue(FloorBuffDataFile, new TypeReference<>() {}));

            File MainScreenCgDataFile = DataUtils.getDataFile("MainScreenCg");
            gameDataMgr.setMainScreenCgConfigMap(objectMapper.readValue(MainScreenCgDataFile, new TypeReference<>() {}));

            File MallMonthlyCardDataFile = DataUtils.getDataFile("MallMonthlyCard");
            gameDataMgr.setMallMonthlyCardConfigMap(objectMapper.readValue(MallMonthlyCardDataFile, new TypeReference<>() {}));

            File PeriodicQuestControlDataFile = DataUtils.getDataFile("PeriodicQuestControl");
            gameDataMgr.setPeriodicQuestControlConfigMap(objectMapper.readValue(PeriodicQuestControlDataFile, new TypeReference<>() {}));

            File RegionBossLevelDataFile = DataUtils.getDataFile("RegionBossLevel");
            gameDataMgr.setRegionBossLevelConfigMap(objectMapper.readValue(RegionBossLevelDataFile, new TypeReference<>() {}));

            File LevelQuestTargetDataFile = DataUtils.getDataFile("LevelQuestTarget");
            gameDataMgr.setLevelQuestTargetConfigMap(objectMapper.readValue(LevelQuestTargetDataFile, new TypeReference<>() {}));

            File PotentialDataFile = DataUtils.getDataFile("Potential");
            gameDataMgr.setPotentialConfigMap(objectMapper.readValue(PotentialDataFile, new TypeReference<>() {}));

            File CharRaritySequenceDataFile = DataUtils.getDataFile("CharRaritySequence");
            gameDataMgr.setCharRaritySequenceConfigMap(objectMapper.readValue(CharRaritySequenceDataFile, new TypeReference<>() {}));

            File CharGemSlotControlDataFile = DataUtils.getDataFile("CharGemSlotControl");
            gameDataMgr.setCharGemSlotControlConfigMap(objectMapper.readValue(CharGemSlotControlDataFile, new TypeReference<>() {}));

            File VampireRankSeasonDataFile = DataUtils.getDataFile("VampireRankSeason");
            gameDataMgr.setVampireRankSeasonConfigMap(objectMapper.readValue(VampireRankSeasonDataFile, new TypeReference<>() {}));

            File BreakOutEnemySprDataFile = DataUtils.getDataFile("BreakOutEnemySpr");
            gameDataMgr.setBreakOutEnemySprConfigMap(objectMapper.readValue(BreakOutEnemySprDataFile, new TypeReference<>() {}));

            File GamepadActionDataFile = DataUtils.getDataFile("GamepadAction");
            gameDataMgr.setGamepadActionConfigMap(objectMapper.readValue(GamepadActionDataFile, new TypeReference<>() {}));

            File ItemDataFile = DataUtils.getDataFile("Item");
            gameDataMgr.setItemConfigMap(objectMapper.readValue(ItemDataFile, new TypeReference<>() {}));

            File MallShopDataFile = DataUtils.getDataFile("MallShop");
            gameDataMgr.setMallShopConfigMap(objectMapper.readValue(MallShopDataFile, new TypeReference<>() {}));

            File StarTowerBookFateCardQuestDataFile = DataUtils.getDataFile("StarTowerBookFateCardQuest");
            gameDataMgr.setStarTowerBookFateCardQuestConfigMap(objectMapper.readValue(StarTowerBookFateCardQuestDataFile, new TypeReference<>() {}));

            File SubNoteSkillDataFile = DataUtils.getDataFile("SubNoteSkill");
            gameDataMgr.setSubNoteSkillConfigMap(objectMapper.readValue(SubNoteSkillDataFile, new TypeReference<>() {}));

            File StarTowerShopGoodsDataFile = DataUtils.getDataFile("StarTowerShopGoods");
            gameDataMgr.setStarTowerShopGoodsConfigMap(objectMapper.readValue(StarTowerShopGoodsDataFile, new TypeReference<>() {}));

            File AgentTabDataFile = DataUtils.getDataFile("AgentTab");
            gameDataMgr.setAgentTabConfigMap(objectMapper.readValue(AgentTabDataFile, new TypeReference<>() {}));

            File MonsterSkinDataFile = DataUtils.getDataFile("MonsterSkin");
            gameDataMgr.setMonsterSkinConfigMap(objectMapper.readValue(MonsterSkinDataFile, new TypeReference<>() {}));

            File DiscPromoteLimitDataFile = DataUtils.getDataFile("DiscPromoteLimit");
            gameDataMgr.setDiscPromoteLimitConfigMap(objectMapper.readValue(DiscPromoteLimitDataFile, new TypeReference<>() {}));

            File TowerDefenseFloorDataFile = DataUtils.getDataFile("TowerDefenseFloor");
            gameDataMgr.setTowerDefenseFloorConfigMap(objectMapper.readValue(TowerDefenseFloorDataFile, new TypeReference<>() {}));

            File AgentDataFile = DataUtils.getDataFile("Agent");
            gameDataMgr.setAgentConfigMap(objectMapper.readValue(AgentDataFile, new TypeReference<>() {}));

            File ItemPackMarkDataFile = DataUtils.getDataFile("ItemPackMark");
            gameDataMgr.setItemPackMarkConfigMap(objectMapper.readValue(ItemPackMarkDataFile, new TypeReference<>() {}));

            File MonsterManualDataFile = DataUtils.getDataFile("MonsterManual");
            gameDataMgr.setMonsterManualConfigMap(objectMapper.readValue(MonsterManualDataFile, new TypeReference<>() {}));

            File StarTowerGrowthGroupDataFile = DataUtils.getDataFile("StarTowerGrowthGroup");
            gameDataMgr.setStarTowerGrowthGroupConfigMap(objectMapper.readValue(StarTowerGrowthGroupDataFile, new TypeReference<>() {}));

            File AreaEffectDataFile = DataUtils.getDataFile("AreaEffect");
            gameDataMgr.setAreaEffectConfigMap(objectMapper.readValue(AreaEffectDataFile, new TypeReference<>() {}));

            File PlotDataFile = DataUtils.getDataFile("Plot");
            gameDataMgr.setPlotConfigMap(objectMapper.readValue(PlotDataFile, new TypeReference<>() {}));

            File InteractiveActionDataFile = DataUtils.getDataFile("InteractiveAction");
            gameDataMgr.setInteractiveActionConfigMap(objectMapper.readValue(InteractiveActionDataFile, new TypeReference<>() {}));

            File PopUpSequenceDataFile = DataUtils.getDataFile("PopUpSequence");
            gameDataMgr.setPopUpSequenceConfigMap(objectMapper.readValue(PopUpSequenceDataFile, new TypeReference<>() {}));

            File DatingBranchDataFile = DataUtils.getDataFile("DatingBranch");
            gameDataMgr.setDatingBranchConfigMap(objectMapper.readValue(DatingBranchDataFile, new TypeReference<>() {}));

            File MonsterValueTempleteAdjustDataFile = DataUtils.getDataFile("MonsterValueTempleteAdjust");
            gameDataMgr.setMonsterValueTempleteAdjustConfigMap(objectMapper.readValue(MonsterValueTempleteAdjustDataFile, new TypeReference<>() {}));

            File VoDirectoryDataFile = DataUtils.getDataFile("VoDirectory");
            gameDataMgr.setVoDirectoryConfigMap(objectMapper.readValue(VoDirectoryDataFile, new TypeReference<>() {}));

            File DropDataFile = DataUtils.getDataFile("Drop");
            gameDataMgr.setDropConfigMap(objectMapper.readValue(DropDataFile, new TypeReference<>() {}));

            File StoryConditionDataFile = DataUtils.getDataFile("StoryCondition");
            gameDataMgr.setStoryConditionConfigMap(objectMapper.readValue(StoryConditionDataFile, new TypeReference<>() {}));

            File VampireSurvivorDataFile = DataUtils.getDataFile("VampireSurvivor");
            gameDataMgr.setVampireSurvivorConfigMap(objectMapper.readValue(VampireSurvivorDataFile, new TypeReference<>() {}));

            File EnumDescDataFile = DataUtils.getDataFile("EnumDesc");
            gameDataMgr.setEnumDescConfigMap(objectMapper.readValue(EnumDescDataFile, new TypeReference<>() {}));

            File TrialFloorDataFile = DataUtils.getDataFile("TrialFloor");
            gameDataMgr.setTrialFloorConfigMap(objectMapper.readValue(TrialFloorDataFile, new TypeReference<>() {}));

            File StarTowerComboDataFile = DataUtils.getDataFile("StarTowerCombo");
            gameDataMgr.setStarTowerComboConfigMap(objectMapper.readValue(StarTowerComboDataFile, new TypeReference<>() {}));

            File EndSceneTypeDataFile = DataUtils.getDataFile("EndSceneType");
            gameDataMgr.setEndSceneTypeConfigMap(objectMapper.readValue(EndSceneTypeDataFile, new TypeReference<>() {}));

            File ScoreBossAbilityDataFile = DataUtils.getDataFile("ScoreBossAbility");
            gameDataMgr.setScoreBossAbilityConfigMap(objectMapper.readValue(ScoreBossAbilityDataFile, new TypeReference<>() {}));

            File StarTowerMapDataFile = DataUtils.getDataFile("StarTowerMap");
            gameDataMgr.setStarTowerMapConfigMap(objectMapper.readValue(StarTowerMapDataFile, new TypeReference<>() {}));

            File CharGemInstanceFloorDataFile = DataUtils.getDataFile("CharGemInstanceFloor");
            gameDataMgr.setCharGemInstanceFloorConfigMap(objectMapper.readValue(CharGemInstanceFloorDataFile, new TypeReference<>() {}));

            File PlayerHeadDataFile = DataUtils.getDataFile("PlayerHead");
            gameDataMgr.setPlayerHeadConfigMap(objectMapper.readValue(PlayerHeadDataFile, new TypeReference<>() {}));

            File TopBarDataFile = DataUtils.getDataFile("TopBar");
            gameDataMgr.setTopBarConfigMap(objectMapper.readValue(TopBarDataFile, new TypeReference<>() {}));

            File ContentWordDataFile = DataUtils.getDataFile("ContentWord");
            gameDataMgr.setContentWordConfigMap(objectMapper.readValue(ContentWordDataFile, new TypeReference<>() {}));

            File VampireEnemySetDataFile = DataUtils.getDataFile("VampireEnemySet");
            gameDataMgr.setVampireEnemySetConfigMap(objectMapper.readValue(VampireEnemySetDataFile, new TypeReference<>() {}));

            File ScoreBossControlDataFile = DataUtils.getDataFile("ScoreBossControl");
            gameDataMgr.setScoreBossControlConfigMap(objectMapper.readValue(ScoreBossControlDataFile, new TypeReference<>() {}));

            File MiningStoryDataFile = DataUtils.getDataFile("MiningStory");
            gameDataMgr.setMiningStoryConfigMap(objectMapper.readValue(MiningStoryDataFile, new TypeReference<>() {}));

            File CharGradeDataFile = DataUtils.getDataFile("CharGrade");
            gameDataMgr.setCharGradeConfigMap(objectMapper.readValue(CharGradeDataFile, new TypeReference<>() {}));

            File InfinityTowerAffixDataFile = DataUtils.getDataFile("InfinityTowerAffix");
            gameDataMgr.setInfinityTowerAffixConfigMap(objectMapper.readValue(InfinityTowerAffixDataFile, new TypeReference<>() {}));

            File PeriodicQuestDataFile = DataUtils.getDataFile("PeriodicQuest");
            gameDataMgr.setPeriodicQuestConfigMap(objectMapper.readValue(PeriodicQuestDataFile, new TypeReference<>() {}));

            File ActivityLevelsLevelDataFile = DataUtils.getDataFile("ActivityLevelsLevel");
            gameDataMgr.setActivityLevelsLevelConfigMap(objectMapper.readValue(ActivityLevelsLevelDataFile, new TypeReference<>() {}));

            File BattlePassLevelDataFile = DataUtils.getDataFile("BattlePassLevel");
            gameDataMgr.setBattlePassLevelConfigMap(objectMapper.readValue(BattlePassLevelDataFile, new TypeReference<>() {}));

            File TowerDefenseQuestGroupDataFile = DataUtils.getDataFile("TowerDefenseQuestGroup");
            gameDataMgr.setTowerDefenseQuestGroupConfigMap(objectMapper.readValue(TowerDefenseQuestGroupDataFile, new TypeReference<>() {}));

            File DiscStrengthenDataFile = DataUtils.getDataFile("DiscStrengthen");
            gameDataMgr.setDiscStrengthenConfigMap(objectMapper.readValue(DiscStrengthenDataFile, new TypeReference<>() {}));

            File MonsterDataFile = DataUtils.getDataFile("Monster");
            gameDataMgr.setMonsterConfigMap(objectMapper.readValue(MonsterDataFile, new TypeReference<>() {}));

            File ChatDataFile = DataUtils.getDataFile("Chat");
            gameDataMgr.setChatConfigMap(objectMapper.readValue(ChatDataFile, new TypeReference<>() {}));

            File VampireMapDataFile = DataUtils.getDataFile("VampireMap");
            gameDataMgr.setVampireMapConfigMap(objectMapper.readValue(VampireMapDataFile, new TypeReference<>() {}));

            File JointDrillFloorDataFile = DataUtils.getDataFile("JointDrillFloor");
            gameDataMgr.setJointDrillFloorConfigMap(objectMapper.readValue(JointDrillFloorDataFile, new TypeReference<>() {}));

            File StarTowerMonsterBornGroupDataFile = DataUtils.getDataFile("StarTowerMonsterBornGroup");
            gameDataMgr.setStarTowerMonsterBornGroupConfigMap(objectMapper.readValue(StarTowerMonsterBornGroupDataFile, new TypeReference<>() {}));

            File BannerDataFile = DataUtils.getDataFile("Banner");
            gameDataMgr.setBannerConfigMap(objectMapper.readValue(BannerDataFile, new TypeReference<>() {}));

            File StarTowerDataFile = DataUtils.getDataFile("StarTower");
            gameDataMgr.setStarTowerConfigMap(objectMapper.readValue(StarTowerDataFile, new TypeReference<>() {}));

            File ChapterDataFile = DataUtils.getDataFile("Chapter");
            gameDataMgr.setChapterConfigMap(objectMapper.readValue(ChapterDataFile, new TypeReference<>() {}));

            File InfinityTowerMsgDataFile = DataUtils.getDataFile("InfinityTowerMsg");
            gameDataMgr.setInfinityTowerMsgConfigMap(objectMapper.readValue(InfinityTowerMsgDataFile, new TypeReference<>() {}));

            File BattlePassRewardDataFile = DataUtils.getDataFile("BattlePassReward");
            gameDataMgr.setBattlePassRewardConfigMap(objectMapper.readValue(BattlePassRewardDataFile, new TypeReference<>() {}));

            File CharacterArchiveBaseInfoDataFile = DataUtils.getDataFile("CharacterArchiveBaseInfo");
            gameDataMgr.setCharacterArchiveBaseInfoConfigMap(objectMapper.readValue(CharacterArchiveBaseInfoDataFile, new TypeReference<>() {}));

            File TrapDataFile = DataUtils.getDataFile("Trap");
            gameDataMgr.setTrapConfigMap(objectMapper.readValue(TrapDataFile, new TypeReference<>() {}));

            File TrialDiscDataFile = DataUtils.getDataFile("TrialDisc");
            gameDataMgr.setTrialDiscConfigMap(objectMapper.readValue(TrialDiscDataFile, new TypeReference<>() {}));

            File VampireFloorDataFile = DataUtils.getDataFile("VampireFloor");
            gameDataMgr.setVampireFloorConfigMap(objectMapper.readValue(VampireFloorDataFile, new TypeReference<>() {}));

            File DatingLandmarkEventDataFile = DataUtils.getDataFile("DatingLandmarkEvent");
            gameDataMgr.setDatingLandmarkEventConfigMap(objectMapper.readValue(DatingLandmarkEventDataFile, new TypeReference<>() {}));

            File DiscTagDataFile = DataUtils.getDataFile("DiscTag");
            gameDataMgr.setDiscTagConfigMap(objectMapper.readValue(DiscTagDataFile, new TypeReference<>() {}));

            File ScoreBossBattleThresholdDataFile = DataUtils.getDataFile("ScoreBossBattleThreshold");
            gameDataMgr.setScoreBossBattleThresholdConfigMap(objectMapper.readValue(ScoreBossBattleThresholdDataFile, new TypeReference<>() {}));

            File GachaDataFile = DataUtils.getDataFile("Gacha");
            gameDataMgr.setGachaConfigMap(objectMapper.readValue(GachaDataFile, new TypeReference<>() {}));

            File MonsterAttributeContactDataFile = DataUtils.getDataFile("MonsterAttributeContact");
            gameDataMgr.setMonsterAttributeContactConfigMap(objectMapper.readValue(MonsterAttributeContactDataFile, new TypeReference<>() {}));

            File MonsterAiDataFile = DataUtils.getDataFile("MonsterAi");
            gameDataMgr.setMonsterAiConfigMap(objectMapper.readValue(MonsterAiDataFile, new TypeReference<>() {}));

            File StarTowerCombatEventDataFile = DataUtils.getDataFile("StarTowerCombatEvent");
            gameDataMgr.setStarTowerCombatEventConfigMap(objectMapper.readValue(StarTowerCombatEventDataFile, new TypeReference<>() {}));

            File VampireEnemySpAttrDataFile = DataUtils.getDataFile("VampireEnemySpAttr");
            gameDataMgr.setVampireEnemySpAttrConfigMap(objectMapper.readValue(VampireEnemySpAttrDataFile, new TypeReference<>() {}));

            File StarTowerGrowthNodeDataFile = DataUtils.getDataFile("StarTowerGrowthNode");
            gameDataMgr.setStarTowerGrowthNodeConfigMap(objectMapper.readValue(StarTowerGrowthNodeDataFile, new TypeReference<>() {}));

            File DailyQuestDataFile = DataUtils.getDataFile("DailyQuest");
            gameDataMgr.setDailyQuestConfigMap(objectMapper.readValue(DailyQuestDataFile, new TypeReference<>() {}));

            File BdConvertDataFile = DataUtils.getDataFile("BdConvert");
            gameDataMgr.setBdConvertConfigMap(objectMapper.readValue(BdConvertDataFile, new TypeReference<>() {}));

            File BdConvertControlDataFile = DataUtils.getDataFile("BdConvertControl");
            gameDataMgr.setBdConvertControlConfigMap(objectMapper.readValue(BdConvertControlDataFile, new TypeReference<>() {}));

            File ScoreBossLevelDataFile = DataUtils.getDataFile("ScoreBossLevel");
            gameDataMgr.setScoreBossLevelConfigMap(objectMapper.readValue(ScoreBossLevelDataFile, new TypeReference<>() {}));

            File MonsterActionBranchDataFile = DataUtils.getDataFile("MonsterActionBranch");
            gameDataMgr.setMonsterActionBranchConfigMap(objectMapper.readValue(MonsterActionBranchDataFile, new TypeReference<>() {}));

            File GmOrderDataFile = DataUtils.getDataFile("GmOrder");
            gameDataMgr.setGmOrderConfigMap(objectMapper.readValue(GmOrderDataFile, new TypeReference<>() {}));

            File StarTowerStageDataFile = DataUtils.getDataFile("StarTowerStage");
            gameDataMgr.setStarTowerStageConfigMap(objectMapper.readValue(StarTowerStageDataFile, new TypeReference<>() {}));

            File DestroyObjectDataFile = DataUtils.getDataFile("DestroyObject");
            gameDataMgr.setDestroyObjectConfigMap(objectMapper.readValue(DestroyObjectDataFile, new TypeReference<>() {}));

            File JumpToDataFile = DataUtils.getDataFile("JumpTo");
            gameDataMgr.setJumpToConfigMap(objectMapper.readValue(JumpToDataFile, new TypeReference<>() {}));

            File StarTowerBuildRankDataFile = DataUtils.getDataFile("StarTowerBuildRank");
            gameDataMgr.setStarTowerBuildRankConfigMap(objectMapper.readValue(StarTowerBuildRankDataFile, new TypeReference<>() {}));

            File CharacterDesDataFile = DataUtils.getDataFile("CharacterDes");
            gameDataMgr.setCharacterDesConfigMap(objectMapper.readValue(CharacterDesDataFile, new TypeReference<>() {}));

            File StarTowerEventOptionActionDataFile = DataUtils.getDataFile("StarTowerEventOptionAction");
            gameDataMgr.setStarTowerEventOptionActionConfigMap(objectMapper.readValue(StarTowerEventOptionActionDataFile, new TypeReference<>() {}));

            File StarTowerMapMaxNumPerStageDataFile = DataUtils.getDataFile("StarTowerMapMaxNumPerStage");
            gameDataMgr.setStarTowerMapMaxNumPerStageConfigMap(objectMapper.readValue(StarTowerMapMaxNumPerStageDataFile, new TypeReference<>() {}));

            File CharPotentialDataFile = DataUtils.getDataFile("CharPotential");
            gameDataMgr.setCharPotentialConfigMap(objectMapper.readValue(CharPotentialDataFile, new TypeReference<>() {}));

            File BreakOutCharacterDataFile = DataUtils.getDataFile("BreakOutCharacter");
            gameDataMgr.setBreakOutCharacterConfigMap(objectMapper.readValue(BreakOutCharacterDataFile, new TypeReference<>() {}));

            File CharGetLinesDataFile = DataUtils.getDataFile("CharGetLines");
            gameDataMgr.setCharGetLinesConfigMap(objectMapper.readValue(CharGetLinesDataFile, new TypeReference<>() {}));

            File EventOptionsRulesDataFile = DataUtils.getDataFile("EventOptionsRules");
            gameDataMgr.setEventOptionsRulesConfigMap(objectMapper.readValue(EventOptionsRulesDataFile, new TypeReference<>() {}));

            File InfinityTowerEnemySetDataFile = DataUtils.getDataFile("InfinityTowerEnemySet");
            gameDataMgr.setInfinityTowerEnemySetConfigMap(objectMapper.readValue(InfinityTowerEnemySetDataFile, new TypeReference<>() {}));

            File StoryEvidenceDataFile = DataUtils.getDataFile("StoryEvidence");
            gameDataMgr.setStoryEvidenceConfigMap(objectMapper.readValue(StoryEvidenceDataFile, new TypeReference<>() {}));

            File StarTowerBookEventRewardDataFile = DataUtils.getDataFile("StarTowerBookEventReward");
            gameDataMgr.setStarTowerBookEventRewardConfigMap(objectMapper.readValue(StarTowerBookEventRewardDataFile, new TypeReference<>() {}));

            File DailyInstanceRewardGroupDataFile = DataUtils.getDataFile("DailyInstanceRewardGroup");
            gameDataMgr.setDailyInstanceRewardGroupConfigMap(objectMapper.readValue(DailyInstanceRewardGroupDataFile, new TypeReference<>() {}));

            File DiscDataFile = DataUtils.getDataFile("Disc");
            gameDataMgr.setDiscConfigMap(objectMapper.readValue(DiscDataFile, new TypeReference<>() {}));

            File ProductionDataFile = DataUtils.getDataFile("Production");
            gameDataMgr.setProductionConfigMap(objectMapper.readValue(ProductionDataFile, new TypeReference<>() {}));

            File VampireTalentDataFile = DataUtils.getDataFile("VampireTalent");
            gameDataMgr.setVampireTalentConfigMap(objectMapper.readValue(VampireTalentDataFile, new TypeReference<>() {}));

            File WeightParameterDataFile = DataUtils.getDataFile("WeightParameter");
            gameDataMgr.setWeightParameterConfigMap(objectMapper.readValue(WeightParameterDataFile, new TypeReference<>() {}));

            File DiscItemExpDataFile = DataUtils.getDataFile("DiscItemExp");
            gameDataMgr.setDiscItemExpConfigMap(objectMapper.readValue(DiscItemExpDataFile, new TypeReference<>() {}));

            File StarTowerEventActionDataFile = DataUtils.getDataFile("StarTowerEventAction");
            gameDataMgr.setStarTowerEventActionConfigMap(objectMapper.readValue(StarTowerEventActionDataFile, new TypeReference<>() {}));

            File TrialCharacterDataFile = DataUtils.getDataFile("TrialCharacter");
            gameDataMgr.setTrialCharacterConfigMap(objectMapper.readValue(TrialCharacterDataFile, new TypeReference<>() {}));

            File StarTowerDropItemDataFile = DataUtils.getDataFile("StarTowerDropItem");
            gameDataMgr.setStarTowerDropItemConfigMap(objectMapper.readValue(StarTowerDropItemDataFile, new TypeReference<>() {}));

            File BattlePassQuestDataFile = DataUtils.getDataFile("BattlePassQuest");
            gameDataMgr.setBattlePassQuestConfigMap(objectMapper.readValue(BattlePassQuestDataFile, new TypeReference<>() {}));

            File CharacterDataFile = DataUtils.getDataFile("Character");
            gameDataMgr.setCharacterConfigMap(objectMapper.readValue(CharacterDataFile, new TypeReference<>() {}));

            File JointDrillBattleThresholdDataFile = DataUtils.getDataFile("JointDrillBattleThreshold");
            gameDataMgr.setJointDrillBattleThresholdConfigMap(objectMapper.readValue(JointDrillBattleThresholdDataFile, new TypeReference<>() {}));

            File StarTowerBookEntranceDataFile = DataUtils.getDataFile("StarTowerBookEntrance");
            gameDataMgr.setStarTowerBookEntranceConfigMap(objectMapper.readValue(StarTowerBookEntranceDataFile, new TypeReference<>() {}));

            File EffectValueDataFile = DataUtils.getDataFile("EffectValue");
            gameDataMgr.setEffectValueConfigMap(objectMapper.readValue(EffectValueDataFile, new TypeReference<>() {}));

            File WorldClassDataFile = DataUtils.getDataFile("WorldClass");
            gameDataMgr.setWorldClassConfigMap(objectMapper.readValue(WorldClassDataFile, new TypeReference<>() {}));

            File TravelerDuelFloorDataFile = DataUtils.getDataFile("TravelerDuelFloor");
            gameDataMgr.setTravelerDuelFloorConfigMap(objectMapper.readValue(TravelerDuelFloorDataFile, new TypeReference<>() {}));

            File GamepadButtonDataFile = DataUtils.getDataFile("GamepadButton");
            gameDataMgr.setGamepadButtonConfigMap(objectMapper.readValue(GamepadButtonDataFile, new TypeReference<>() {}));

            File OnceAdditionalAttributeValueDataFile = DataUtils.getDataFile("OnceAdditionalAttributeValue");
            gameDataMgr.setOnceAdditionalAttributeValueConfigMap(objectMapper.readValue(OnceAdditionalAttributeValueDataFile, new TypeReference<>() {}));

            File StarTowerTeamExpDataFile = DataUtils.getDataFile("StarTowerTeamExp");
            gameDataMgr.setStarTowerTeamExpConfigMap(objectMapper.readValue(StarTowerTeamExpDataFile, new TypeReference<>() {}));

            File TravelerDuelBossLevelDataFile = DataUtils.getDataFile("TravelerDuelBossLevel");
            gameDataMgr.setTravelerDuelBossLevelConfigMap(objectMapper.readValue(TravelerDuelBossLevelDataFile, new TypeReference<>() {}));

            File EventOptionsDataFile = DataUtils.getDataFile("EventOptions");
            gameDataMgr.setEventOptionsConfigMap(objectMapper.readValue(EventOptionsDataFile, new TypeReference<>() {}));

            File SkillInstanceDataFile = DataUtils.getDataFile("SkillInstance");
            gameDataMgr.setSkillInstanceConfigMap(objectMapper.readValue(SkillInstanceDataFile, new TypeReference<>() {}));

            File WeekBossTypeDataFile = DataUtils.getDataFile("WeekBossType");
            gameDataMgr.setWeekBossTypeConfigMap(objectMapper.readValue(WeekBossTypeDataFile, new TypeReference<>() {}));

            File ActivityTaskDataFile = DataUtils.getDataFile("ActivityTask");
            gameDataMgr.setActivityTaskConfigMap(objectMapper.readValue(ActivityTaskDataFile, new TypeReference<>() {}));

            File TestCharacterAttDataFile = DataUtils.getDataFile("TestCharacterAtt");
            gameDataMgr.setTestCharacterAttConfigMap(objectMapper.readValue(TestCharacterAttDataFile, new TypeReference<>() {}));

            File DiscIpDataFile = DataUtils.getDataFile("DiscIp");
            gameDataMgr.setDiscIpConfigMap(objectMapper.readValue(DiscIpDataFile, new TypeReference<>() {}));

            File LevelQuestDataFile = DataUtils.getDataFile("LevelQuest");
            gameDataMgr.setLevelQuestConfigMap(objectMapper.readValue(LevelQuestDataFile, new TypeReference<>() {}));

            File ResidentShopDataFile = DataUtils.getDataFile("ResidentShop");
            gameDataMgr.setResidentShopConfigMap(objectMapper.readValue(ResidentShopDataFile, new TypeReference<>() {}));

            File DailyInstanceTypeDataFile = DataUtils.getDataFile("DailyInstanceType");
            gameDataMgr.setDailyInstanceTypeConfigMap(objectMapper.readValue(DailyInstanceTypeDataFile, new TypeReference<>() {}));

            File CharacterSkillUpgradeDataFile = DataUtils.getDataFile("CharacterSkillUpgrade");
            gameDataMgr.setCharacterSkillUpgradeConfigMap(objectMapper.readValue(CharacterSkillUpgradeDataFile, new TypeReference<>() {}));

            File MiningTreasureDataFile = DataUtils.getDataFile("MiningTreasure");
            gameDataMgr.setMiningTreasureConfigMap(objectMapper.readValue(MiningTreasureDataFile, new TypeReference<>() {}));

            File ConfigDataFile = DataUtils.getDataFile("Config");
            gameDataMgr.setConfigConfigMap(objectMapper.readValue(ConfigDataFile, new TypeReference<>() {}));

            File TutorialLevelFloorDataFile = DataUtils.getDataFile("TutorialLevelFloor");
            gameDataMgr.setTutorialLevelFloorConfigMap(objectMapper.readValue(TutorialLevelFloorDataFile, new TypeReference<>() {}));

            File CharacterSkinThemeDataFile = DataUtils.getDataFile("CharacterSkinTheme");
            gameDataMgr.setCharacterSkinThemeConfigMap(objectMapper.readValue(CharacterSkinThemeDataFile, new TypeReference<>() {}));

            File DictionaryTopBarEntryDataFile = DataUtils.getDataFile("DictionaryTopBarEntry");
            gameDataMgr.setDictionaryTopBarEntryConfigMap(objectMapper.readValue(DictionaryTopBarEntryDataFile, new TypeReference<>() {}));

            File FateCardDataFile = DataUtils.getDataFile("FateCard");
            gameDataMgr.setFateCardConfigMap(objectMapper.readValue(FateCardDataFile, new TypeReference<>() {}));

            File GmTeamDataFile = DataUtils.getDataFile("GmTeam");
            gameDataMgr.setGmTeamConfigMap(objectMapper.readValue(GmTeamDataFile, new TypeReference<>() {}));

            File TowerDefenseMonsterDataFile = DataUtils.getDataFile("TowerDefenseMonster");
            gameDataMgr.setTowerDefenseMonsterConfigMap(objectMapper.readValue(TowerDefenseMonsterDataFile, new TypeReference<>() {}));

            File VampireTalentFloorDataFile = DataUtils.getDataFile("VampireTalentFloor");
            gameDataMgr.setVampireTalentFloorConfigMap(objectMapper.readValue(VampireTalentFloorDataFile, new TypeReference<>() {}));

            File DemonAdvanceDataFile = DataUtils.getDataFile("DemonAdvance");
            gameDataMgr.setDemonAdvanceConfigMap(objectMapper.readValue(DemonAdvanceDataFile, new TypeReference<>() {}));

            File WeeklyQuestDataFile = DataUtils.getDataFile("WeeklyQuest");
            gameDataMgr.setWeeklyQuestConfigMap(objectMapper.readValue(WeeklyQuestDataFile, new TypeReference<>() {}));

            File AcquireRewardDataFile = DataUtils.getDataFile("AcquireReward");
            gameDataMgr.setAcquireRewardConfigMap(objectMapper.readValue(AcquireRewardDataFile, new TypeReference<>() {}));

            File VampireTalentDescDataFile = DataUtils.getDataFile("VampireTalentDesc");
            gameDataMgr.setVampireTalentDescConfigMap(objectMapper.readValue(VampireTalentDescDataFile, new TypeReference<>() {}));

            File DailyQuestActiveDataFile = DataUtils.getDataFile("DailyQuestActive");
            gameDataMgr.setDailyQuestActiveConfigMap(objectMapper.readValue(DailyQuestActiveDataFile, new TypeReference<>() {}));

            File StarTowerFloorDataFile = DataUtils.getDataFile("StarTowerFloor");
            gameDataMgr.setStarTowerFloorConfigMap(objectMapper.readValue(StarTowerFloorDataFile, new TypeReference<>() {}));

            File StarTowerBuildDataFile = DataUtils.getDataFile("StarTowerBuild");
            gameDataMgr.setStarTowerBuildConfigMap(objectMapper.readValue(StarTowerBuildDataFile, new TypeReference<>() {}));

            File StarTowerBookFateCardDataFile = DataUtils.getDataFile("StarTowerBookFateCard");
            gameDataMgr.setStarTowerBookFateCardConfigMap(objectMapper.readValue(StarTowerBookFateCardDataFile, new TypeReference<>() {}));

            File BoardNpcDataFile = DataUtils.getDataFile("BoardNpc");
            gameDataMgr.setBoardNpcConfigMap(objectMapper.readValue(BoardNpcDataFile, new TypeReference<>() {}));

            File TalentDataFile = DataUtils.getDataFile("Talent");
            gameDataMgr.setTalentConfigMap(objectMapper.readValue(TalentDataFile, new TypeReference<>() {}));

            File CharacterCgDataFile = DataUtils.getDataFile("CharacterCg");
            gameDataMgr.setCharacterCgConfigMap(objectMapper.readValue(CharacterCgDataFile, new TypeReference<>() {}));

            File HonorCharacterDataFile = DataUtils.getDataFile("HonorCharacter");
            gameDataMgr.setHonorCharacterConfigMap(objectMapper.readValue(HonorCharacterDataFile, new TypeReference<>() {}));

            File ActivityGoodsDataFile = DataUtils.getDataFile("ActivityGoods");
            gameDataMgr.setActivityGoodsConfigMap(objectMapper.readValue(ActivityGoodsDataFile, new TypeReference<>() {}));

            File MonsterValueTempleteModifyDataFile = DataUtils.getDataFile("MonsterValueTempleteModify");
            gameDataMgr.setMonsterValueTempleteModifyConfigMap(objectMapper.readValue(MonsterValueTempleteModifyDataFile, new TypeReference<>() {}));

            File OpenFuncDataFile = DataUtils.getDataFile("OpenFunc");
            gameDataMgr.setOpenFuncConfigMap(objectMapper.readValue(OpenFuncDataFile, new TypeReference<>() {}));

            File JointDrillControlDataFile = DataUtils.getDataFile("JointDrillControl");
            gameDataMgr.setJointDrillControlConfigMap(objectMapper.readValue(JointDrillControlDataFile, new TypeReference<>() {}));

            File AddBuffActionDataFile = DataUtils.getDataFile("AddBuffAction");
            gameDataMgr.setAddBuffActionConfigMap(objectMapper.readValue(AddBuffActionDataFile, new TypeReference<>() {}));

            File RegionBossFloorDataFile = DataUtils.getDataFile("RegionBossFloor");
            gameDataMgr.setRegionBossFloorConfigMap(objectMapper.readValue(RegionBossFloorDataFile, new TypeReference<>() {}));

            File ShieldValueDataFile = DataUtils.getDataFile("ShieldValue");
            gameDataMgr.setShieldValueConfigMap(objectMapper.readValue(ShieldValueDataFile, new TypeReference<>() {}));

            File StoryRolePersonalityDataFile = DataUtils.getDataFile("StoryRolePersonality");
            gameDataMgr.setStoryRolePersonalityConfigMap(objectMapper.readValue(StoryRolePersonalityDataFile, new TypeReference<>() {}));

            File ActivityAvgLevelDataFile = DataUtils.getDataFile("ActivityAvgLevel");
            gameDataMgr.setActivityAvgLevelConfigMap(objectMapper.readValue(ActivityAvgLevelDataFile, new TypeReference<>() {}));

            File ActivityTaskControlDataFile = DataUtils.getDataFile("ActivityTaskControl");
            gameDataMgr.setActivityTaskControlConfigMap(objectMapper.readValue(ActivityTaskControlDataFile, new TypeReference<>() {}));

            File AffinityQuestDataFile = DataUtils.getDataFile("AffinityQuest");
            gameDataMgr.setAffinityQuestConfigMap(objectMapper.readValue(AffinityQuestDataFile, new TypeReference<>() {}));

            File DatingCharTagDataFile = DataUtils.getDataFile("DatingCharTag");
            gameDataMgr.setDatingCharTagConfigMap(objectMapper.readValue(DatingCharTagDataFile, new TypeReference<>() {}));

            File CharacterAdvanceDataFile = DataUtils.getDataFile("CharacterAdvance");
            gameDataMgr.setCharacterAdvanceConfigMap(objectMapper.readValue(CharacterAdvanceDataFile, new TypeReference<>() {}));

            File ScoreBossRewardDataFile = DataUtils.getDataFile("ScoreBossReward");
            gameDataMgr.setScoreBossRewardConfigMap(objectMapper.readValue(ScoreBossRewardDataFile, new TypeReference<>() {}));

            log.info("游戏数据加载完成，耗时{}ms", System.currentTimeMillis() - start);

        });
    }
}