package com.nailong.xt.data.load;

import com.nailong.xt.common.utils.DataUtils;
import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Map;

@Component
@ToString
@RequiredArgsConstructor
public class JsonDataAutoLoad {
    private final ObjectMapper objectMapper;
    private final GameDataMgr gameDataMgr;

    private static final String TowerDefenseGuideDataName = "TowerDefenseGuide";
    private static final String ShieldDataName = "Shield";
    private static final String DropItemShowDataName = "DropItemShow";
    private static final String ActivityDataName = "Activity";
    private static final String TowerDefenseCharacterDataName = "TowerDefenseCharacter";
    private static final String AttributeSetLimitDataName = "AttributeSetLimit";
    private static final String HandbookDataName = "Handbook";
    private static final String StarTowerFloorExpDataName = "StarTowerFloorExp";
    private static final String StoryPersonalityDataName = "StoryPersonality";
    private static final String FormationSceneDataName = "FormationScene";
    private static final String DatingLandmarkDataName = "DatingLandmark";
    private static final String TravelerDuelChallengeDifficultyDataName = "TravelerDuelChallengeDifficulty";
    private static final String CharacterTagDataName = "CharacterTag";
    private static final String FactionRelationDataName = "FactionRelation";
    private static final String AssistQuestGroupDataName = "AssistQuestGroup";
    private static final String MonsterValueTempleteDataName = "MonsterValueTemplete";
    private static final String ActivityGroupDataName = "ActivityGroup";
    private static final String CharacterSkinPanelFaceDataName = "CharacterSkinPanelFace";
    private static final String BreakOutFloorDataName = "BreakOutFloor";
    private static final String DatingCharResponseDataName = "DatingCharResponse";
    private static final String MainlineFloorDataName = "MainlineFloor";
    private static final String StoryDataName = "Story";
    private static final String VampireEnemyPoolDataName = "VampireEnemyPool";
    private static final String BdConvertContentDataName = "BdConvertContent";
    private static final String TravelerDuelChallengeQuestDataName = "TravelerDuelChallengeQuest";
    private static final String ActivityShopDataName = "ActivityShop";
    private static final String AffinityLevelDataName = "AffinityLevel";
    private static final String ScoreBossFloorDataName = "ScoreBossFloor";
    private static final String ScoreGetSwitchDataName = "ScoreGetSwitch";
    private static final String StarTowerBookFateCardBundleDataName = "StarTowerBookFateCardBundle";
    private static final String CharGemInstanceTypeDataName = "CharGemInstanceType";
    private static final String GachaNewbieDataName = "GachaNewbie";
    private static final String DiscPromoteDataName = "DiscPromote";
    private static final String BattlePassDataName = "BattlePass";
    private static final String BattleThresholdDataName = "BattleThreshold";
    private static final String MonthlyCardDataName = "MonthlyCard";
    private static final String BdConvertRewardGroupDataName = "BdConvertRewardGroup";
    private static final String ScoreBossGetControlDataName = "ScoreBossGetControl";
    private static final String ActivityStoryDataName = "ActivityStory";
    private static final String MainSkillDataName = "MainSkill";
    private static final String PopUpDataName = "PopUp";
    private static final String ProduceHelperDataName = "ProduceHelper";
    private static final String StarTowerTalkDataName = "StarTowerTalk";
    private static final String EffectDataName = "Effect";
    private static final String StarTowerBookPotentialRewardDataName = "StarTowerBookPotentialReward";
    private static final String CookieControlDataName = "CookieControl";
    private static final String DropPkgDataName = "DropPkg";
    private static final String StoryChapterTimeStampDataName = "StoryChapterTimeStamp";
    private static final String AgentSpecialPerformanceDataName = "AgentSpecialPerformance";
    private static final String HitDamageDataName = "HitDamage";
    private static final String TalentGroupDataName = "TalentGroup";
    private static final String AttributeDataName = "Attribute";
    private static final String InfinityTowerBountyLevelDataName = "InfinityTowerBountyLevel";
    private static final String JointDrillRankDataName = "JointDrillRank";
    private static final String AiDataName = "Ai";
    private static final String OnceAdditionalAttributeDataName = "OnceAdditionalAttribute";
    private static final String TourGuideQuestDataName = "TourGuideQuest";
    private static final String StarTowerGroupDataName = "StarTowerGroup";
    private static final String StarTowerSpModeDataName = "StarTowerSpMode";
    private static final String TrialBuildDataName = "TrialBuild";
    private static final String MiningControlDataName = "MiningControl";
    private static final String ScoreBossStarDataName = "ScoreBossStar";
    private static final String TowerDefenseControlDataName = "TowerDefenseControl";
    private static final String MailTemplateDataName = "MailTemplate";
    private static final String TravelerDuelChallengeAffixDataName = "TravelerDuelChallengeAffix";
    private static final String TowerDefenseItemDataName = "TowerDefenseItem";
    private static final String TrialPotentialDataName = "TrialPotential";
    private static final String AssistAttributeDataName = "AssistAttribute";
    private static final String SubNoteSkillDropGroupDataName = "SubNoteSkillDropGroup";
    private static final String HonorDataName = "Honor";
    private static final String StarTowerEventDataName = "StarTowerEvent";
    private static final String BdConvertConditionDataName = "BdConvertCondition";
    private static final String StarTowerScenePrefabDataName = "StarTowerScenePrefab";
    private static final String WeekBossFloorDataName = "WeekBossFloor";
    private static final String GuideGroupDataName = "GuideGroup";
    private static final String RegionBossAffixDataName = "RegionBossAffix";
    private static final String NpcConfigDataName = "NpcConfig";
    private static final String MiningSupportDataName = "MiningSupport";
    private static final String RankDataName = "Rank";
    private static final String TourGuideQuestGroupDataName = "TourGuideQuestGroup";
    private static final String BuffDataName = "Buff";
    private static final String CharGemInstanceDataName = "CharGemInstance";
    private static final String GachaATypeProbDataName = "GachaATypeProb";
    private static final String ScoreBossRankDataName = "ScoreBossRank";
    private static final String EventResultDataName = "EventResult";
    private static final String StarTowerMonsterSpAttrDataName = "StarTowerMonsterSpAttr";
    private static final String TravelerDuelBossDataName = "TravelerDuelBoss";
    private static final String SignInDataName = "SignIn";
    private static final String CharacterArchiveVoiceDataName = "CharacterArchiveVoice";
    private static final String DropObjectGroupDataName = "DropObjectGroup";
    private static final String MonsterTeamDataName = "MonsterTeam";
    private static final String DailyInstanceDataName = "DailyInstance";
    private static final String StarTowerQuestDataName = "StarTowerQuest";
    private static final String StorySetChapterDataName = "StorySetChapter";
    private static final String RegionBossDataName = "RegionBoss";
    private static final String StoryChapterDataName = "StoryChapter";
    private static final String NpcAffinityPlotDataName = "NpcAffinityPlot";
    private static final String CharItemExpDataName = "CharItemExp";
    private static final String SecondarySkillDataName = "SecondarySkill";
    private static final String GachaPkgDataName = "GachaPkg";
    private static final String MiningDemoConfigDataName = "MiningDemoConfig";
    private static final String WeekBossAffixDataName = "WeekBossAffix";
    private static final String MallGemDataName = "MallGem";
    private static final String ProductionTypeDataName = "ProductionType";
    private static final String TestCharacterListDataName = "TestCharacterList";
    private static final String DropObjectDataName = "DropObject";
    private static final String DictionaryEntryDataName = "DictionaryEntry";
    private static final String AffinityUpRewardDataName = "AffinityUpReward";
    private static final String StarTowerEnemySetDataName = "StarTowerEnemySet";
    private static final String TrialControlDataName = "TrialControl";
    private static final String VampireSurvivorQuestDataName = "VampireSurvivorQuest";
    private static final String ScriptParameterDataName = "ScriptParameter";
    private static final String TestTeamDataDataName = "TestTeamData";
    private static final String AchievementDataName = "Achievement";
    private static final String ScriptParameterValueDataName = "ScriptParameterValue";
    private static final String CookiePackagePathsGroupDataName = "CookiePackagePathsGroup";
    private static final String JointDrillLevelDataName = "JointDrillLevel";
    private static final String CharacterUpgradeDataName = "CharacterUpgrade";
    private static final String HtmlConfigDataName = "HtmlConfig";
    private static final String CharGemAttrValueDataName = "CharGemAttrValue";
    private static final String TowerDefenceCharacterAiDataName = "TowerDefenceCharacterAi";
    private static final String InfinityTowerMapDataName = "InfinityTowerMap";
    private static final String DatingCharacterEventDataName = "DatingCharacterEvent";
    private static final String ActivityStoryConditionDataName = "ActivityStoryCondition";
    private static final String ActivityLevelsFloorDataName = "ActivityLevelsFloor";
    private static final String StarTowerNpcDataName = "StarTowerNpc";
    private static final String CookieFloorDataName = "CookieFloor";
    private static final String VampireSurvivorLevelDataName = "VampireSurvivorLevel";
    private static final String GmSupermanDataName = "GmSuperman";
    private static final String TrialGroupDataName = "TrialGroup";
    private static final String WeekBossLevelDataName = "WeekBossLevel";
    private static final String GmBuildDataName = "GmBuild";
    private static final String CharGemDataName = "CharGem";
    private static final String ResidentGoodsDataName = "ResidentGoods";
    private static final String CharAffinityTemplateDataName = "CharAffinityTemplate";
    private static final String TowerDefenseQuestDataName = "TowerDefenseQuest";
    private static final String MangaLoadingDataName = "MangaLoading";
    private static final String CookieLevelDataName = "CookieLevel";
    private static final String GuideDataName = "Guide";
    private static final String ForceDataName = "Force";
    private static final String StarTowerFloorSetDataName = "StarTowerFloorSet";
    private static final String TutorialLevelDataName = "TutorialLevel";
    private static final String ActivityStoryEvidenceDataName = "ActivityStoryEvidence";
    private static final String CharacterSkinDataName = "CharacterSkin";
    private static final String DestroyObjectSprDataName = "DestroyObjectSpr";
    private static final String EnergyBuyDataName = "EnergyBuy";
    private static final String TowerDefenseLevelDataName = "TowerDefenseLevel";
    private static final String PreviewMonsterGroupDataName = "PreviewMonsterGroup";
    private static final String MallShopPageDataName = "MallShopPage";
    private static final String DatingStartEndEventDataName = "DatingStartEndEvent";
    private static final String ActivityStoryChapterDataName = "ActivityStoryChapter";
    private static final String DictionaryDiagramDataName = "DictionaryDiagram";
    private static final String SkillInstanceFloorDataName = "SkillInstanceFloor";
    private static final String BuffEffectDataName = "BuffEffect";
    private static final String AttributeLimitDataName = "AttributeLimit";
    private static final String DailyInstanceFloorDataName = "DailyInstanceFloor";
    private static final String PeriodicQuestGroupDataName = "PeriodicQuestGroup";
    private static final String CookieRhythmlResultDataName = "CookieRhythmlResult";
    private static final String CharacterArchiveDataName = "CharacterArchive";
    private static final String NpcAffinityGroupDataName = "NpcAffinityGroup";
    private static final String InfinityTowerFloorDataName = "InfinityTowerFloor";
    private static final String ActivityShopControlDataName = "ActivityShopControl";
    private static final String AdControlDataName = "AdControl";
    private static final String InfinityTowerLevelDataName = "InfinityTowerLevel";
    private static final String DiscExtraAttributeDataName = "DiscExtraAttribute";
    private static final String GachaStorageDataName = "GachaStorage";
    private static final String LoginRewardGroupDataName = "LoginRewardGroup";
    private static final String AffinityGiftDataName = "AffinityGift";
    private static final String WeeklyQuestActiveDataName = "WeeklyQuestActive";
    private static final String TowerDefensePotentialDataName = "TowerDefensePotential";
    private static final String ActivityTaskGroupDataName = "ActivityTaskGroup";
    private static final String LoginRewardControlDataName = "LoginRewardControl";
    private static final String TitleDataName = "Title";
    private static final String AssistQuestDataName = "AssistQuest";
    private static final String DailyQuestAwardDataName = "DailyQuestAward";
    private static final String TravelerDuelChallengeControlDataName = "TravelerDuelChallengeControl";
    private static final String JointDrillQuestDataName = "JointDrillQuest";
    private static final String MallPackageDataName = "MallPackage";
    private static final String EffectDescDataName = "EffectDesc";
    private static final String JointDrillAffixDataName = "JointDrillAffix";
    private static final String GachaTypeDataName = "GachaType";
    private static final String SkillDataName = "Skill";
    private static final String MallPackagePageDataName = "MallPackagePage";
    private static final String SkillInstanceTypeDataName = "SkillInstanceType";
    private static final String InfinityTowerDataName = "InfinityTower";
    private static final String SubNoteSkillPromoteGroupDataName = "SubNoteSkillPromoteGroup";
    private static final String DictionaryTabDataName = "DictionaryTab";
    private static final String CharacterVoiceControlDataName = "CharacterVoiceControl";
    private static final String TowerDefenseTeamExpDataName = "TowerDefenseTeamExp";
    private static final String UiTextDataName = "UiText";
    private static final String ErrorCodeDataName = "ErrorCode";
    private static final String InfinityTowerDifficultyDataName = "InfinityTowerDifficulty";
    private static final String StorySetSectionDataName = "StorySetSection";
    private static final String BuffValueDataName = "BuffValue";
    private static final String CharacterArchiveContentDataName = "CharacterArchiveContent";
    private static final String ChestDataName = "Chest";
    private static final String NpcSkinDataName = "NpcSkin";
    private static final String WordDataName = "Word";
    private static final String FloorBuffDataName = "FloorBuff";
    private static final String MainScreenCgDataName = "MainScreenCg";
    private static final String MallMonthlyCardDataName = "MallMonthlyCard";
    private static final String PeriodicQuestControlDataName = "PeriodicQuestControl";
    private static final String RegionBossLevelDataName = "RegionBossLevel";
    private static final String LevelQuestTargetDataName = "LevelQuestTarget";
    private static final String PotentialDataName = "Potential";
    private static final String CharRaritySequenceDataName = "CharRaritySequence";
    private static final String CharGemSlotControlDataName = "CharGemSlotControl";
    private static final String VampireRankSeasonDataName = "VampireRankSeason";
    private static final String BreakOutEnemySprDataName = "BreakOutEnemySpr";
    private static final String GamepadActionDataName = "GamepadAction";
    private static final String ItemDataName = "Item";
    private static final String MallShopDataName = "MallShop";
    private static final String StarTowerBookFateCardQuestDataName = "StarTowerBookFateCardQuest";
    private static final String SubNoteSkillDataName = "SubNoteSkill";
    private static final String StarTowerShopGoodsDataName = "StarTowerShopGoods";
    private static final String AgentTabDataName = "AgentTab";
    private static final String MonsterSkinDataName = "MonsterSkin";
    private static final String DiscPromoteLimitDataName = "DiscPromoteLimit";
    private static final String TowerDefenseFloorDataName = "TowerDefenseFloor";
    private static final String AgentDataName = "Agent";
    private static final String ItemPackMarkDataName = "ItemPackMark";
    private static final String MonsterManualDataName = "MonsterManual";
    private static final String StarTowerGrowthGroupDataName = "StarTowerGrowthGroup";
    private static final String AreaEffectDataName = "AreaEffect";
    private static final String PlotDataName = "Plot";
    private static final String InteractiveActionDataName = "InteractiveAction";
    private static final String PopUpSequenceDataName = "PopUpSequence";
    private static final String DatingBranchDataName = "DatingBranch";
    private static final String MonsterValueTempleteAdjustDataName = "MonsterValueTempleteAdjust";
    private static final String VoDirectoryDataName = "VoDirectory";
    private static final String DropDataName = "Drop";
    private static final String StoryConditionDataName = "StoryCondition";
    private static final String VampireSurvivorDataName = "VampireSurvivor";
    private static final String EnumDescDataName = "EnumDesc";
    private static final String TrialFloorDataName = "TrialFloor";
    private static final String StarTowerComboDataName = "StarTowerCombo";
    private static final String EndSceneTypeDataName = "EndSceneType";
    private static final String ScoreBossAbilityDataName = "ScoreBossAbility";
    private static final String StarTowerMapDataName = "StarTowerMap";
    private static final String CharGemInstanceFloorDataName = "CharGemInstanceFloor";
    private static final String PlayerHeadDataName = "PlayerHead";
    private static final String TopBarDataName = "TopBar";
    private static final String ContentWordDataName = "ContentWord";
    private static final String VampireEnemySetDataName = "VampireEnemySet";
    private static final String ScoreBossControlDataName = "ScoreBossControl";
    private static final String MiningStoryDataName = "MiningStory";
    private static final String CharGradeDataName = "CharGrade";
    private static final String InfinityTowerAffixDataName = "InfinityTowerAffix";
    private static final String PeriodicQuestDataName = "PeriodicQuest";
    private static final String ActivityLevelsLevelDataName = "ActivityLevelsLevel";
    private static final String BattlePassLevelDataName = "BattlePassLevel";
    private static final String TowerDefenseQuestGroupDataName = "TowerDefenseQuestGroup";
    private static final String DiscStrengthenDataName = "DiscStrengthen";
    private static final String MonsterDataName = "Monster";
    private static final String ChatDataName = "Chat";
    private static final String VampireMapDataName = "VampireMap";
    private static final String JointDrillFloorDataName = "JointDrillFloor";
    private static final String StarTowerMonsterBornGroupDataName = "StarTowerMonsterBornGroup";
    private static final String BannerDataName = "Banner";
    private static final String StarTowerDataName = "StarTower";
    private static final String ChapterDataName = "Chapter";
    private static final String InfinityTowerMsgDataName = "InfinityTowerMsg";
    private static final String BattlePassRewardDataName = "BattlePassReward";
    private static final String CharacterArchiveBaseInfoDataName = "CharacterArchiveBaseInfo";
    private static final String TrapDataName = "Trap";
    private static final String TrialDiscDataName = "TrialDisc";
    private static final String VampireFloorDataName = "VampireFloor";
    private static final String DatingLandmarkEventDataName = "DatingLandmarkEvent";
    private static final String DiscTagDataName = "DiscTag";
    private static final String ScoreBossBattleThresholdDataName = "ScoreBossBattleThreshold";
    private static final String GachaDataName = "Gacha";
    private static final String MonsterAttributeContactDataName = "MonsterAttributeContact";
    private static final String MonsterAiDataName = "MonsterAi";
    private static final String StarTowerCombatEventDataName = "StarTowerCombatEvent";
    private static final String VampireEnemySpAttrDataName = "VampireEnemySpAttr";
    private static final String StarTowerGrowthNodeDataName = "StarTowerGrowthNode";
    private static final String DailyQuestDataName = "DailyQuest";
    private static final String BdConvertDataName = "BdConvert";
    private static final String BdConvertControlDataName = "BdConvertControl";
    private static final String ScoreBossLevelDataName = "ScoreBossLevel";
    private static final String MonsterActionBranchDataName = "MonsterActionBranch";
    private static final String GmOrderDataName = "GmOrder";
    private static final String StarTowerStageDataName = "StarTowerStage";
    private static final String DestroyObjectDataName = "DestroyObject";
    private static final String JumpToDataName = "JumpTo";
    private static final String StarTowerBuildRankDataName = "StarTowerBuildRank";
    private static final String CharacterDesDataName = "CharacterDes";
    private static final String StarTowerEventOptionActionDataName = "StarTowerEventOptionAction";
    private static final String StarTowerMapMaxNumPerStageDataName = "StarTowerMapMaxNumPerStage";
    private static final String CharPotentialDataName = "CharPotential";
    private static final String BreakOutCharacterDataName = "BreakOutCharacter";
    private static final String CharGetLinesDataName = "CharGetLines";
    private static final String EventOptionsRulesDataName = "EventOptionsRules";
    private static final String InfinityTowerEnemySetDataName = "InfinityTowerEnemySet";
    private static final String StoryEvidenceDataName = "StoryEvidence";
    private static final String StarTowerBookEventRewardDataName = "StarTowerBookEventReward";
    private static final String DailyInstanceRewardGroupDataName = "DailyInstanceRewardGroup";
    private static final String DiscDataName = "Disc";
    private static final String ProductionDataName = "Production";
    private static final String VampireTalentDataName = "VampireTalent";
    private static final String WeightParameterDataName = "WeightParameter";
    private static final String DiscItemExpDataName = "DiscItemExp";
    private static final String StarTowerEventActionDataName = "StarTowerEventAction";
    private static final String TrialCharacterDataName = "TrialCharacter";
    private static final String StarTowerDropItemDataName = "StarTowerDropItem";
    private static final String BattlePassQuestDataName = "BattlePassQuest";
    private static final String CharacterDataName = "Character";
    private static final String JointDrillBattleThresholdDataName = "JointDrillBattleThreshold";
    private static final String StarTowerBookEntranceDataName = "StarTowerBookEntrance";
    private static final String EffectValueDataName = "EffectValue";
    private static final String WorldClassDataName = "WorldClass";
    private static final String TravelerDuelFloorDataName = "TravelerDuelFloor";
    private static final String GamepadButtonDataName = "GamepadButton";
    private static final String OnceAdditionalAttributeValueDataName = "OnceAdditionalAttributeValue";
    private static final String StarTowerTeamExpDataName = "StarTowerTeamExp";
    private static final String TravelerDuelBossLevelDataName = "TravelerDuelBossLevel";
    private static final String EventOptionsDataName = "EventOptions";
    private static final String SkillInstanceDataName = "SkillInstance";
    private static final String WeekBossTypeDataName = "WeekBossType";
    private static final String ActivityTaskDataName = "ActivityTask";
    private static final String TestCharacterAttDataName = "TestCharacterAtt";
    private static final String DiscIpDataName = "DiscIp";
    private static final String LevelQuestDataName = "LevelQuest";
    private static final String ResidentShopDataName = "ResidentShop";
    private static final String DailyInstanceTypeDataName = "DailyInstanceType";
    private static final String CharacterSkillUpgradeDataName = "CharacterSkillUpgrade";
    private static final String MiningTreasureDataName = "MiningTreasure";
    private static final String ConfigDataName = "Config";
    private static final String TutorialLevelFloorDataName = "TutorialLevelFloor";
    private static final String CharacterSkinThemeDataName = "CharacterSkinTheme";
    private static final String DictionaryTopBarEntryDataName = "DictionaryTopBarEntry";
    private static final String FateCardDataName = "FateCard";
    private static final String GmTeamDataName = "GmTeam";
    private static final String TowerDefenseMonsterDataName = "TowerDefenseMonster";
    private static final String VampireTalentFloorDataName = "VampireTalentFloor";
    private static final String DemonAdvanceDataName = "DemonAdvance";
    private static final String WeeklyQuestDataName = "WeeklyQuest";
    private static final String AcquireRewardDataName = "AcquireReward";
    private static final String VampireTalentDescDataName = "VampireTalentDesc";
    private static final String DailyQuestActiveDataName = "DailyQuestActive";
    private static final String StarTowerFloorDataName = "StarTowerFloor";
    private static final String StarTowerBuildDataName = "StarTowerBuild";
    private static final String StarTowerBookFateCardDataName = "StarTowerBookFateCard";
    private static final String BoardNpcDataName = "BoardNpc";
    private static final String TalentDataName = "Talent";
    private static final String CharacterCgDataName = "CharacterCg";
    private static final String HonorCharacterDataName = "HonorCharacter";
    private static final String ActivityGoodsDataName = "ActivityGoods";
    private static final String MonsterValueTempleteModifyDataName = "MonsterValueTempleteModify";
    private static final String OpenFuncDataName = "OpenFunc";
    private static final String JointDrillControlDataName = "JointDrillControl";
    private static final String AddBuffActionDataName = "AddBuffAction";
    private static final String RegionBossFloorDataName = "RegionBossFloor";
    private static final String ShieldValueDataName = "ShieldValue";
    private static final String StoryRolePersonalityDataName = "StoryRolePersonality";
    private static final String ActivityAvgLevelDataName = "ActivityAvgLevel";
    private static final String ActivityTaskControlDataName = "ActivityTaskControl";
    private static final String AffinityQuestDataName = "AffinityQuest";
    private static final String DatingCharTagDataName = "DatingCharTag";
    private static final String CharacterAdvanceDataName = "CharacterAdvance";
    private static final String ScoreBossRewardDataName = "ScoreBossReward";

    public void autoLoadTowerDefenseGuideConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefenseGuideDataName);

        // 解析为 Map<String, TowerDefenseGuide>
        Map<String, TowerDefenseGuideConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefenseGuideConfigMap(tempMap);
    }

    public void autoLoadShieldConfig() {
        File dataFile = DataUtils.getDataFile(ShieldDataName);

        // 解析为 Map<String, Shield>
        Map<String, ShieldConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setShieldConfigMap(tempMap);
    }

    public void autoLoadDropItemShowConfig() {
        File dataFile = DataUtils.getDataFile(DropItemShowDataName);

        // 解析为 Map<String, DropItemShow>
        Map<String, DropItemShowConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDropItemShowConfigMap(tempMap);
    }

    public void autoLoadActivityConfig() {
        File dataFile = DataUtils.getDataFile(ActivityDataName);

        // 解析为 Map<String, Activity>
        Map<String, ActivityConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityConfigMap(tempMap);
    }

    public void autoLoadTowerDefenseCharacterConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefenseCharacterDataName);

        // 解析为 Map<String, TowerDefenseCharacter>
        Map<String, TowerDefenseCharacterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefenseCharacterConfigMap(tempMap);
    }

    public void autoLoadAttributeSetLimitConfig() {
        File dataFile = DataUtils.getDataFile(AttributeSetLimitDataName);

        // 解析为 Map<String, AttributeSetLimit>
        Map<String, AttributeSetLimitConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAttributeSetLimitConfigMap(tempMap);
    }

    public void autoLoadHandbookConfig() {
        File dataFile = DataUtils.getDataFile(HandbookDataName);

        // 解析为 Map<String, Handbook>
        Map<String, HandbookConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setHandbookConfigMap(tempMap);
    }

    public void autoLoadStarTowerFloorExpConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerFloorExpDataName);

        // 解析为 Map<String, StarTowerFloorExp>
        Map<String, StarTowerFloorExpConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerFloorExpConfigMap(tempMap);
    }

    public void autoLoadStoryPersonalityConfig() {
        File dataFile = DataUtils.getDataFile(StoryPersonalityDataName);

        // 解析为 Map<String, StoryPersonality>
        Map<String, StoryPersonalityConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStoryPersonalityConfigMap(tempMap);
    }

    public void autoLoadFormationSceneConfig() {
        File dataFile = DataUtils.getDataFile(FormationSceneDataName);

        // 解析为 Map<String, FormationScene>
        Map<String, FormationSceneConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setFormationSceneConfigMap(tempMap);
    }

    public void autoLoadDatingLandmarkConfig() {
        File dataFile = DataUtils.getDataFile(DatingLandmarkDataName);

        // 解析为 Map<String, DatingLandmark>
        Map<String, DatingLandmarkConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDatingLandmarkConfigMap(tempMap);
    }

    public void autoLoadTravelerDuelChallengeDifficultyConfig() {
        File dataFile = DataUtils.getDataFile(TravelerDuelChallengeDifficultyDataName);

        // 解析为 Map<String, TravelerDuelChallengeDifficulty>
        Map<String, TravelerDuelChallengeDifficultyConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTravelerDuelChallengeDifficultyConfigMap(tempMap);
    }

    public void autoLoadCharacterTagConfig() {
        File dataFile = DataUtils.getDataFile(CharacterTagDataName);

        // 解析为 Map<String, CharacterTag>
        Map<String, CharacterTagConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterTagConfigMap(tempMap);
    }

    public void autoLoadFactionRelationConfig() {
        File dataFile = DataUtils.getDataFile(FactionRelationDataName);

        // 解析为 Map<String, FactionRelation>
        Map<String, FactionRelationConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setFactionRelationConfigMap(tempMap);
    }

    public void autoLoadAssistQuestGroupConfig() {
        File dataFile = DataUtils.getDataFile(AssistQuestGroupDataName);

        // 解析为 Map<String, AssistQuestGroup>
        Map<String, AssistQuestGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAssistQuestGroupConfigMap(tempMap);
    }

    public void autoLoadMonsterValueTempleteConfig() {
        File dataFile = DataUtils.getDataFile(MonsterValueTempleteDataName);

        // 解析为 Map<String, MonsterValueTemplete>
        Map<String, MonsterValueTempleteConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMonsterValueTempleteConfigMap(tempMap);
    }

    public void autoLoadActivityGroupConfig() {
        File dataFile = DataUtils.getDataFile(ActivityGroupDataName);

        // 解析为 Map<String, ActivityGroup>
        Map<String, ActivityGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityGroupConfigMap(tempMap);
    }

    public void autoLoadCharacterSkinPanelFaceConfig() {
        File dataFile = DataUtils.getDataFile(CharacterSkinPanelFaceDataName);

        // 解析为 Map<String, CharacterSkinPanelFace>
        Map<String, CharacterSkinPanelFaceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterSkinPanelFaceConfigMap(tempMap);
    }

    public void autoLoadBreakOutFloorConfig() {
        File dataFile = DataUtils.getDataFile(BreakOutFloorDataName);

        // 解析为 Map<String, BreakOutFloor>
        Map<String, BreakOutFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBreakOutFloorConfigMap(tempMap);
    }

    public void autoLoadDatingCharResponseConfig() {
        File dataFile = DataUtils.getDataFile(DatingCharResponseDataName);

        // 解析为 Map<String, DatingCharResponse>
        Map<String, DatingCharResponseConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDatingCharResponseConfigMap(tempMap);
    }

    public void autoLoadMainlineFloorConfig() {
        File dataFile = DataUtils.getDataFile(MainlineFloorDataName);

        // 解析为 Map<String, MainlineFloor>
        Map<String, MainlineFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMainlineFloorConfigMap(tempMap);
    }

    public void autoLoadStoryConfig() {
        File dataFile = DataUtils.getDataFile(StoryDataName);

        // 解析为 Map<String, Story>
        Map<String, StoryConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStoryConfigMap(tempMap);
    }

    public void autoLoadVampireEnemyPoolConfig() {
        File dataFile = DataUtils.getDataFile(VampireEnemyPoolDataName);

        // 解析为 Map<String, VampireEnemyPool>
        Map<String, VampireEnemyPoolConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireEnemyPoolConfigMap(tempMap);
    }

    public void autoLoadBdConvertContentConfig() {
        File dataFile = DataUtils.getDataFile(BdConvertContentDataName);

        // 解析为 Map<String, BdConvertContent>
        Map<String, BdConvertContentConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBdConvertContentConfigMap(tempMap);
    }

    public void autoLoadTravelerDuelChallengeQuestConfig() {
        File dataFile = DataUtils.getDataFile(TravelerDuelChallengeQuestDataName);

        // 解析为 Map<String, TravelerDuelChallengeQuest>
        Map<String, TravelerDuelChallengeQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTravelerDuelChallengeQuestConfigMap(tempMap);
    }

    public void autoLoadActivityShopConfig() {
        File dataFile = DataUtils.getDataFile(ActivityShopDataName);

        // 解析为 Map<String, ActivityShop>
        Map<String, ActivityShopConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityShopConfigMap(tempMap);
    }

    public void autoLoadAffinityLevelConfig() {
        File dataFile = DataUtils.getDataFile(AffinityLevelDataName);

        // 解析为 Map<String, AffinityLevel>
        Map<String, AffinityLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAffinityLevelConfigMap(tempMap);
    }

    public void autoLoadScoreBossFloorConfig() {
        File dataFile = DataUtils.getDataFile(ScoreBossFloorDataName);

        // 解析为 Map<String, ScoreBossFloor>
        Map<String, ScoreBossFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScoreBossFloorConfigMap(tempMap);
    }

    public void autoLoadScoreGetSwitchConfig() {
        File dataFile = DataUtils.getDataFile(ScoreGetSwitchDataName);

        // 解析为 Map<String, ScoreGetSwitch>
        Map<String, ScoreGetSwitchConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScoreGetSwitchConfigMap(tempMap);
    }

    public void autoLoadStarTowerBookFateCardBundleConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerBookFateCardBundleDataName);

        // 解析为 Map<String, StarTowerBookFateCardBundle>
        Map<String, StarTowerBookFateCardBundleConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerBookFateCardBundleConfigMap(tempMap);
    }

    public void autoLoadCharGemInstanceTypeConfig() {
        File dataFile = DataUtils.getDataFile(CharGemInstanceTypeDataName);

        // 解析为 Map<String, CharGemInstanceType>
        Map<String, CharGemInstanceTypeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharGemInstanceTypeConfigMap(tempMap);
    }

    public void autoLoadGachaNewbieConfig() {
        File dataFile = DataUtils.getDataFile(GachaNewbieDataName);

        // 解析为 Map<String, GachaNewbie>
        Map<String, GachaNewbieConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGachaNewbieConfigMap(tempMap);
    }

    public void autoLoadDiscPromoteConfig() {
        File dataFile = DataUtils.getDataFile(DiscPromoteDataName);

        // 解析为 Map<String, DiscPromote>
        Map<String, DiscPromoteConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDiscPromoteConfigMap(tempMap);
    }

    public void autoLoadBattlePassConfig() {
        File dataFile = DataUtils.getDataFile(BattlePassDataName);

        // 解析为 Map<String, BattlePass>
        Map<String, BattlePassConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBattlePassConfigMap(tempMap);
    }

    public void autoLoadBattleThresholdConfig() {
        File dataFile = DataUtils.getDataFile(BattleThresholdDataName);

        // 解析为 Map<String, BattleThreshold>
        Map<String, BattleThresholdConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBattleThresholdConfigMap(tempMap);
    }

    public void autoLoadMonthlyCardConfig() {
        File dataFile = DataUtils.getDataFile(MonthlyCardDataName);

        // 解析为 Map<String, MonthlyCard>
        Map<String, MonthlyCardConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMonthlyCardConfigMap(tempMap);
    }

    public void autoLoadBdConvertRewardGroupConfig() {
        File dataFile = DataUtils.getDataFile(BdConvertRewardGroupDataName);

        // 解析为 Map<String, BdConvertRewardGroup>
        Map<String, BdConvertRewardGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBdConvertRewardGroupConfigMap(tempMap);
    }

    public void autoLoadScoreBossGetControlConfig() {
        File dataFile = DataUtils.getDataFile(ScoreBossGetControlDataName);

        // 解析为 Map<String, ScoreBossGetControl>
        Map<String, ScoreBossGetControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScoreBossGetControlConfigMap(tempMap);
    }

    public void autoLoadActivityStoryConfig() {
        File dataFile = DataUtils.getDataFile(ActivityStoryDataName);

        // 解析为 Map<String, ActivityStory>
        Map<String, ActivityStoryConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityStoryConfigMap(tempMap);
    }

    public void autoLoadMainSkillConfig() {
        File dataFile = DataUtils.getDataFile(MainSkillDataName);

        // 解析为 Map<String, MainSkill>
        Map<String, MainSkillConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMainSkillConfigMap(tempMap);
    }

    public void autoLoadPopUpConfig() {
        File dataFile = DataUtils.getDataFile(PopUpDataName);

        // 解析为 Map<String, PopUp>
        Map<String, PopUpConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setPopUpConfigMap(tempMap);
    }

    public void autoLoadProduceHelperConfig() {
        File dataFile = DataUtils.getDataFile(ProduceHelperDataName);

        // 解析为 Map<String, ProduceHelper>
        Map<String, ProduceHelperConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setProduceHelperConfigMap(tempMap);
    }

    public void autoLoadStarTowerTalkConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerTalkDataName);

        // 解析为 Map<String, StarTowerTalk>
        Map<String, StarTowerTalkConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerTalkConfigMap(tempMap);
    }

    public void autoLoadEffectConfig() {
        File dataFile = DataUtils.getDataFile(EffectDataName);

        // 解析为 Map<String, Effect>
        Map<String, EffectConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setEffectConfigMap(tempMap);
    }

    public void autoLoadStarTowerBookPotentialRewardConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerBookPotentialRewardDataName);

        // 解析为 Map<String, StarTowerBookPotentialReward>
        Map<String, StarTowerBookPotentialRewardConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerBookPotentialRewardConfigMap(tempMap);
    }

    public void autoLoadCookieControlConfig() {
        File dataFile = DataUtils.getDataFile(CookieControlDataName);

        // 解析为 Map<String, CookieControl>
        Map<String, CookieControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCookieControlConfigMap(tempMap);
    }

    public void autoLoadDropPkgConfig() {
        File dataFile = DataUtils.getDataFile(DropPkgDataName);

        // 解析为 Map<String, DropPkg>
        Map<String, DropPkgConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDropPkgConfigMap(tempMap);
    }

    public void autoLoadStoryChapterTimeStampConfig() {
        File dataFile = DataUtils.getDataFile(StoryChapterTimeStampDataName);

        // 解析为 Map<String, StoryChapterTimeStamp>
        Map<String, StoryChapterTimeStampConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStoryChapterTimeStampConfigMap(tempMap);
    }

    public void autoLoadAgentSpecialPerformanceConfig() {
        File dataFile = DataUtils.getDataFile(AgentSpecialPerformanceDataName);

        // 解析为 Map<String, AgentSpecialPerformance>
        Map<String, AgentSpecialPerformanceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAgentSpecialPerformanceConfigMap(tempMap);
    }

    public void autoLoadHitDamageConfig() {
        File dataFile = DataUtils.getDataFile(HitDamageDataName);

        // 解析为 Map<String, HitDamage>
        Map<String, HitDamageConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setHitDamageConfigMap(tempMap);
    }

    public void autoLoadTalentGroupConfig() {
        File dataFile = DataUtils.getDataFile(TalentGroupDataName);

        // 解析为 Map<String, TalentGroup>
        Map<String, TalentGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTalentGroupConfigMap(tempMap);
    }

    public void autoLoadAttributeConfig() {
        File dataFile = DataUtils.getDataFile(AttributeDataName);

        // 解析为 Map<String, Attribute>
        Map<String, AttributeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAttributeConfigMap(tempMap);
    }

    public void autoLoadInfinityTowerBountyLevelConfig() {
        File dataFile = DataUtils.getDataFile(InfinityTowerBountyLevelDataName);

        // 解析为 Map<String, InfinityTowerBountyLevel>
        Map<String, InfinityTowerBountyLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setInfinityTowerBountyLevelConfigMap(tempMap);
    }

    public void autoLoadJointDrillRankConfig() {
        File dataFile = DataUtils.getDataFile(JointDrillRankDataName);

        // 解析为 Map<String, JointDrillRank>
        Map<String, JointDrillRankConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setJointDrillRankConfigMap(tempMap);
    }

    public void autoLoadAiConfig() {
        File dataFile = DataUtils.getDataFile(AiDataName);

        // 解析为 Map<String, Ai>
        Map<String, AiConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAiConfigMap(tempMap);
    }

    public void autoLoadOnceAdditionalAttributeConfig() {
        File dataFile = DataUtils.getDataFile(OnceAdditionalAttributeDataName);

        // 解析为 Map<String, OnceAdditionalAttribute>
        Map<String, OnceAdditionalAttributeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setOnceAdditionalAttributeConfigMap(tempMap);
    }

    public void autoLoadTourGuideQuestConfig() {
        File dataFile = DataUtils.getDataFile(TourGuideQuestDataName);

        // 解析为 Map<String, TourGuideQuest>
        Map<String, TourGuideQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTourGuideQuestConfigMap(tempMap);
    }

    public void autoLoadStarTowerGroupConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerGroupDataName);

        // 解析为 Map<String, StarTowerGroup>
        Map<String, StarTowerGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerGroupConfigMap(tempMap);
    }

    public void autoLoadStarTowerSpModeConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerSpModeDataName);

        // 解析为 Map<String, StarTowerSpMode>
        Map<String, StarTowerSpModeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerSpModeConfigMap(tempMap);
    }

    public void autoLoadTrialBuildConfig() {
        File dataFile = DataUtils.getDataFile(TrialBuildDataName);

        // 解析为 Map<String, TrialBuild>
        Map<String, TrialBuildConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTrialBuildConfigMap(tempMap);
    }

    public void autoLoadMiningControlConfig() {
        File dataFile = DataUtils.getDataFile(MiningControlDataName);

        // 解析为 Map<String, MiningControl>
        Map<String, MiningControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMiningControlConfigMap(tempMap);
    }

    public void autoLoadScoreBossStarConfig() {
        File dataFile = DataUtils.getDataFile(ScoreBossStarDataName);

        // 解析为 Map<String, ScoreBossStar>
        Map<String, ScoreBossStarConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScoreBossStarConfigMap(tempMap);
    }

    public void autoLoadTowerDefenseControlConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefenseControlDataName);

        // 解析为 Map<String, TowerDefenseControl>
        Map<String, TowerDefenseControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefenseControlConfigMap(tempMap);
    }

    public void autoLoadMailTemplateConfig() {
        File dataFile = DataUtils.getDataFile(MailTemplateDataName);

        // 解析为 Map<String, MailTemplate>
        Map<String, MailTemplateConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMailTemplateConfigMap(tempMap);
    }

    public void autoLoadTravelerDuelChallengeAffixConfig() {
        File dataFile = DataUtils.getDataFile(TravelerDuelChallengeAffixDataName);

        // 解析为 Map<String, TravelerDuelChallengeAffix>
        Map<String, TravelerDuelChallengeAffixConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTravelerDuelChallengeAffixConfigMap(tempMap);
    }

    public void autoLoadTowerDefenseItemConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefenseItemDataName);

        // 解析为 Map<String, TowerDefenseItem>
        Map<String, TowerDefenseItemConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefenseItemConfigMap(tempMap);
    }

    public void autoLoadTrialPotentialConfig() {
        File dataFile = DataUtils.getDataFile(TrialPotentialDataName);

        // 解析为 Map<String, TrialPotential>
        Map<String, TrialPotentialConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTrialPotentialConfigMap(tempMap);
    }

    public void autoLoadAssistAttributeConfig() {
        File dataFile = DataUtils.getDataFile(AssistAttributeDataName);

        // 解析为 Map<String, AssistAttribute>
        Map<String, AssistAttributeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAssistAttributeConfigMap(tempMap);
    }

    public void autoLoadSubNoteSkillDropGroupConfig() {
        File dataFile = DataUtils.getDataFile(SubNoteSkillDropGroupDataName);

        // 解析为 Map<String, SubNoteSkillDropGroup>
        Map<String, SubNoteSkillDropGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setSubNoteSkillDropGroupConfigMap(tempMap);
    }

    public void autoLoadHonorConfig() {
        File dataFile = DataUtils.getDataFile(HonorDataName);

        // 解析为 Map<String, Honor>
        Map<String, HonorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setHonorConfigMap(tempMap);
    }

    public void autoLoadStarTowerEventConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerEventDataName);

        // 解析为 Map<String, StarTowerEvent>
        Map<String, StarTowerEventConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerEventConfigMap(tempMap);
    }

    public void autoLoadBdConvertConditionConfig() {
        File dataFile = DataUtils.getDataFile(BdConvertConditionDataName);

        // 解析为 Map<String, BdConvertCondition>
        Map<String, BdConvertConditionConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBdConvertConditionConfigMap(tempMap);
    }

    public void autoLoadStarTowerScenePrefabConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerScenePrefabDataName);

        // 解析为 Map<String, StarTowerScenePrefab>
        Map<String, StarTowerScenePrefabConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerScenePrefabConfigMap(tempMap);
    }

    public void autoLoadWeekBossFloorConfig() {
        File dataFile = DataUtils.getDataFile(WeekBossFloorDataName);

        // 解析为 Map<String, WeekBossFloor>
        Map<String, WeekBossFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setWeekBossFloorConfigMap(tempMap);
    }

    public void autoLoadGuideGroupConfig() {
        File dataFile = DataUtils.getDataFile(GuideGroupDataName);

        // 解析为 Map<String, GuideGroup>
        Map<String, GuideGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGuideGroupConfigMap(tempMap);
    }

    public void autoLoadRegionBossAffixConfig() {
        File dataFile = DataUtils.getDataFile(RegionBossAffixDataName);

        // 解析为 Map<String, RegionBossAffix>
        Map<String, RegionBossAffixConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setRegionBossAffixConfigMap(tempMap);
    }

    public void autoLoadNpcConfigConfig() {
        File dataFile = DataUtils.getDataFile(NpcConfigDataName);

        // 解析为 Map<String, NpcConfig>
        Map<String, NpcConfigConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setNpcConfigConfigMap(tempMap);
    }

    public void autoLoadMiningSupportConfig() {
        File dataFile = DataUtils.getDataFile(MiningSupportDataName);

        // 解析为 Map<String, MiningSupport>
        Map<String, MiningSupportConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMiningSupportConfigMap(tempMap);
    }

    public void autoLoadRankConfig() {
        File dataFile = DataUtils.getDataFile(RankDataName);

        // 解析为 Map<String, Rank>
        Map<String, RankConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setRankConfigMap(tempMap);
    }

    public void autoLoadTourGuideQuestGroupConfig() {
        File dataFile = DataUtils.getDataFile(TourGuideQuestGroupDataName);

        // 解析为 Map<String, TourGuideQuestGroup>
        Map<String, TourGuideQuestGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTourGuideQuestGroupConfigMap(tempMap);
    }

    public void autoLoadBuffConfig() {
        File dataFile = DataUtils.getDataFile(BuffDataName);

        // 解析为 Map<String, Buff>
        Map<String, BuffConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBuffConfigMap(tempMap);
    }

    public void autoLoadCharGemInstanceConfig() {
        File dataFile = DataUtils.getDataFile(CharGemInstanceDataName);

        // 解析为 Map<String, CharGemInstance>
        Map<String, CharGemInstanceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharGemInstanceConfigMap(tempMap);
    }

    public void autoLoadGachaATypeProbConfig() {
        File dataFile = DataUtils.getDataFile(GachaATypeProbDataName);

        // 解析为 Map<String, GachaATypeProb>
        Map<String, GachaATypeProbConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGachaATypeProbConfigMap(tempMap);
    }

    public void autoLoadScoreBossRankConfig() {
        File dataFile = DataUtils.getDataFile(ScoreBossRankDataName);

        // 解析为 Map<String, ScoreBossRank>
        Map<String, ScoreBossRankConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScoreBossRankConfigMap(tempMap);
    }

    public void autoLoadEventResultConfig() {
        File dataFile = DataUtils.getDataFile(EventResultDataName);

        // 解析为 Map<String, EventResult>
        Map<String, EventResultConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setEventResultConfigMap(tempMap);
    }

    public void autoLoadStarTowerMonsterSpAttrConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerMonsterSpAttrDataName);

        // 解析为 Map<String, StarTowerMonsterSpAttr>
        Map<String, StarTowerMonsterSpAttrConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerMonsterSpAttrConfigMap(tempMap);
    }

    public void autoLoadTravelerDuelBossConfig() {
        File dataFile = DataUtils.getDataFile(TravelerDuelBossDataName);

        // 解析为 Map<String, TravelerDuelBoss>
        Map<String, TravelerDuelBossConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTravelerDuelBossConfigMap(tempMap);
    }

    public void autoLoadSignInConfig() {
        File dataFile = DataUtils.getDataFile(SignInDataName);

        // 解析为 Map<String, SignIn>
        Map<String, SignInConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setSignInConfigMap(tempMap);
    }

    public void autoLoadCharacterArchiveVoiceConfig() {
        File dataFile = DataUtils.getDataFile(CharacterArchiveVoiceDataName);

        // 解析为 Map<String, CharacterArchiveVoice>
        Map<String, CharacterArchiveVoiceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterArchiveVoiceConfigMap(tempMap);
    }

    public void autoLoadDropObjectGroupConfig() {
        File dataFile = DataUtils.getDataFile(DropObjectGroupDataName);

        // 解析为 Map<String, DropObjectGroup>
        Map<String, DropObjectGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDropObjectGroupConfigMap(tempMap);
    }

    public void autoLoadMonsterTeamConfig() {
        File dataFile = DataUtils.getDataFile(MonsterTeamDataName);

        // 解析为 Map<String, MonsterTeam>
        Map<String, MonsterTeamConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMonsterTeamConfigMap(tempMap);
    }

    public void autoLoadDailyInstanceConfig() {
        File dataFile = DataUtils.getDataFile(DailyInstanceDataName);

        // 解析为 Map<String, DailyInstance>
        Map<String, DailyInstanceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDailyInstanceConfigMap(tempMap);
    }

    public void autoLoadStarTowerQuestConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerQuestDataName);

        // 解析为 Map<String, StarTowerQuest>
        Map<String, StarTowerQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerQuestConfigMap(tempMap);
    }

    public void autoLoadStorySetChapterConfig() {
        File dataFile = DataUtils.getDataFile(StorySetChapterDataName);

        // 解析为 Map<String, StorySetChapter>
        Map<String, StorySetChapterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStorySetChapterConfigMap(tempMap);
    }

    public void autoLoadRegionBossConfig() {
        File dataFile = DataUtils.getDataFile(RegionBossDataName);

        // 解析为 Map<String, RegionBoss>
        Map<String, RegionBossConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setRegionBossConfigMap(tempMap);
    }

    public void autoLoadStoryChapterConfig() {
        File dataFile = DataUtils.getDataFile(StoryChapterDataName);

        // 解析为 Map<String, StoryChapter>
        Map<String, StoryChapterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStoryChapterConfigMap(tempMap);
    }

    public void autoLoadNpcAffinityPlotConfig() {
        File dataFile = DataUtils.getDataFile(NpcAffinityPlotDataName);

        // 解析为 Map<String, NpcAffinityPlot>
        Map<String, NpcAffinityPlotConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setNpcAffinityPlotConfigMap(tempMap);
    }

    public void autoLoadCharItemExpConfig() {
        File dataFile = DataUtils.getDataFile(CharItemExpDataName);

        // 解析为 Map<String, CharItemExp>
        Map<String, CharItemExpConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharItemExpConfigMap(tempMap);
    }

    public void autoLoadSecondarySkillConfig() {
        File dataFile = DataUtils.getDataFile(SecondarySkillDataName);

        // 解析为 Map<String, SecondarySkill>
        Map<String, SecondarySkillConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setSecondarySkillConfigMap(tempMap);
    }

    public void autoLoadGachaPkgConfig() {
        File dataFile = DataUtils.getDataFile(GachaPkgDataName);

        // 解析为 Map<String, GachaPkg>
        Map<String, GachaPkgConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGachaPkgConfigMap(tempMap);
    }

    public void autoLoadMiningDemoConfigConfig() {
        File dataFile = DataUtils.getDataFile(MiningDemoConfigDataName);

        // 解析为 Map<String, MiningDemoConfig>
        Map<String, MiningDemoConfigConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMiningDemoConfigConfigMap(tempMap);
    }

    public void autoLoadWeekBossAffixConfig() {
        File dataFile = DataUtils.getDataFile(WeekBossAffixDataName);

        // 解析为 Map<String, WeekBossAffix>
        Map<String, WeekBossAffixConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setWeekBossAffixConfigMap(tempMap);
    }

    public void autoLoadMallGemConfig() {
        File dataFile = DataUtils.getDataFile(MallGemDataName);

        // 解析为 Map<String, MallGem>
        Map<String, MallGemConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMallGemConfigMap(tempMap);
    }

    public void autoLoadProductionTypeConfig() {
        File dataFile = DataUtils.getDataFile(ProductionTypeDataName);

        // 解析为 Map<String, ProductionType>
        Map<String, ProductionTypeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setProductionTypeConfigMap(tempMap);
    }

    public void autoLoadTestCharacterListConfig() {
        File dataFile = DataUtils.getDataFile(TestCharacterListDataName);

        // 解析为 Map<String, TestCharacterList>
        Map<String, TestCharacterListConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTestCharacterListConfigMap(tempMap);
    }

    public void autoLoadDropObjectConfig() {
        File dataFile = DataUtils.getDataFile(DropObjectDataName);

        // 解析为 Map<String, DropObject>
        Map<String, DropObjectConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDropObjectConfigMap(tempMap);
    }

    public void autoLoadDictionaryEntryConfig() {
        File dataFile = DataUtils.getDataFile(DictionaryEntryDataName);

        // 解析为 Map<String, DictionaryEntry>
        Map<String, DictionaryEntryConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDictionaryEntryConfigMap(tempMap);
    }

    public void autoLoadAffinityUpRewardConfig() {
        File dataFile = DataUtils.getDataFile(AffinityUpRewardDataName);

        // 解析为 Map<String, AffinityUpReward>
        Map<String, AffinityUpRewardConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAffinityUpRewardConfigMap(tempMap);
    }

    public void autoLoadStarTowerEnemySetConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerEnemySetDataName);

        // 解析为 Map<String, StarTowerEnemySet>
        Map<String, StarTowerEnemySetConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerEnemySetConfigMap(tempMap);
    }

    public void autoLoadTrialControlConfig() {
        File dataFile = DataUtils.getDataFile(TrialControlDataName);

        // 解析为 Map<String, TrialControl>
        Map<String, TrialControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTrialControlConfigMap(tempMap);
    }

    public void autoLoadVampireSurvivorQuestConfig() {
        File dataFile = DataUtils.getDataFile(VampireSurvivorQuestDataName);

        // 解析为 Map<String, VampireSurvivorQuest>
        Map<String, VampireSurvivorQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireSurvivorQuestConfigMap(tempMap);
    }

    public void autoLoadScriptParameterConfig() {
        File dataFile = DataUtils.getDataFile(ScriptParameterDataName);

        // 解析为 Map<String, ScriptParameter>
        Map<String, ScriptParameterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScriptParameterConfigMap(tempMap);
    }

    public void autoLoadTestTeamDataConfig() {
        File dataFile = DataUtils.getDataFile(TestTeamDataDataName);

        // 解析为 Map<String, TestTeamData>
        Map<String, TestTeamDataConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTestTeamDataConfigMap(tempMap);
    }

    public void autoLoadAchievementConfig() {
        File dataFile = DataUtils.getDataFile(AchievementDataName);

        // 解析为 Map<String, Achievement>
        Map<String, AchievementConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAchievementConfigMap(tempMap);
    }

    public void autoLoadScriptParameterValueConfig() {
        File dataFile = DataUtils.getDataFile(ScriptParameterValueDataName);

        // 解析为 Map<String, ScriptParameterValue>
        Map<String, ScriptParameterValueConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScriptParameterValueConfigMap(tempMap);
    }

    public void autoLoadCookiePackagePathsGroupConfig() {
        File dataFile = DataUtils.getDataFile(CookiePackagePathsGroupDataName);

        // 解析为 Map<String, CookiePackagePathsGroup>
        Map<String, CookiePackagePathsGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCookiePackagePathsGroupConfigMap(tempMap);
    }

    public void autoLoadJointDrillLevelConfig() {
        File dataFile = DataUtils.getDataFile(JointDrillLevelDataName);

        // 解析为 Map<String, JointDrillLevel>
        Map<String, JointDrillLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setJointDrillLevelConfigMap(tempMap);
    }

    public void autoLoadCharacterUpgradeConfig() {
        File dataFile = DataUtils.getDataFile(CharacterUpgradeDataName);

        // 解析为 Map<String, CharacterUpgrade>
        Map<String, CharacterUpgradeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterUpgradeConfigMap(tempMap);
    }

    public void autoLoadHtmlConfigConfig() {
        File dataFile = DataUtils.getDataFile(HtmlConfigDataName);

        // 解析为 Map<String, HtmlConfig>
        Map<String, HtmlConfigConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setHtmlConfigConfigMap(tempMap);
    }

    public void autoLoadCharGemAttrValueConfig() {
        File dataFile = DataUtils.getDataFile(CharGemAttrValueDataName);

        // 解析为 Map<String, CharGemAttrValue>
        Map<String, CharGemAttrValueConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharGemAttrValueConfigMap(tempMap);
    }

    public void autoLoadTowerDefenceCharacterAiConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefenceCharacterAiDataName);

        // 解析为 Map<String, TowerDefenceCharacterAi>
        Map<String, TowerDefenceCharacterAiConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefenceCharacterAiConfigMap(tempMap);
    }

    public void autoLoadInfinityTowerMapConfig() {
        File dataFile = DataUtils.getDataFile(InfinityTowerMapDataName);

        // 解析为 Map<String, InfinityTowerMap>
        Map<String, InfinityTowerMapConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setInfinityTowerMapConfigMap(tempMap);
    }

    public void autoLoadDatingCharacterEventConfig() {
        File dataFile = DataUtils.getDataFile(DatingCharacterEventDataName);

        // 解析为 Map<String, DatingCharacterEvent>
        Map<String, DatingCharacterEventConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDatingCharacterEventConfigMap(tempMap);
    }

    public void autoLoadActivityStoryConditionConfig() {
        File dataFile = DataUtils.getDataFile(ActivityStoryConditionDataName);

        // 解析为 Map<String, ActivityStoryCondition>
        Map<String, ActivityStoryConditionConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityStoryConditionConfigMap(tempMap);
    }

    public void autoLoadActivityLevelsFloorConfig() {
        File dataFile = DataUtils.getDataFile(ActivityLevelsFloorDataName);

        // 解析为 Map<String, ActivityLevelsFloor>
        Map<String, ActivityLevelsFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityLevelsFloorConfigMap(tempMap);
    }

    public void autoLoadStarTowerNpcConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerNpcDataName);

        // 解析为 Map<String, StarTowerNpc>
        Map<String, StarTowerNpcConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerNpcConfigMap(tempMap);
    }

    public void autoLoadCookieFloorConfig() {
        File dataFile = DataUtils.getDataFile(CookieFloorDataName);

        // 解析为 Map<String, CookieFloor>
        Map<String, CookieFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCookieFloorConfigMap(tempMap);
    }

    public void autoLoadVampireSurvivorLevelConfig() {
        File dataFile = DataUtils.getDataFile(VampireSurvivorLevelDataName);

        // 解析为 Map<String, VampireSurvivorLevel>
        Map<String, VampireSurvivorLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireSurvivorLevelConfigMap(tempMap);
    }

    public void autoLoadGmSupermanConfig() {
        File dataFile = DataUtils.getDataFile(GmSupermanDataName);

        // 解析为 Map<String, GmSuperman>
        Map<String, GmSupermanConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGmSupermanConfigMap(tempMap);
    }

    public void autoLoadTrialGroupConfig() {
        File dataFile = DataUtils.getDataFile(TrialGroupDataName);

        // 解析为 Map<String, TrialGroup>
        Map<String, TrialGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTrialGroupConfigMap(tempMap);
    }

    public void autoLoadWeekBossLevelConfig() {
        File dataFile = DataUtils.getDataFile(WeekBossLevelDataName);

        // 解析为 Map<String, WeekBossLevel>
        Map<String, WeekBossLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setWeekBossLevelConfigMap(tempMap);
    }

    public void autoLoadGmBuildConfig() {
        File dataFile = DataUtils.getDataFile(GmBuildDataName);

        // 解析为 Map<String, GmBuild>
        Map<String, GmBuildConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGmBuildConfigMap(tempMap);
    }

    public void autoLoadCharGemConfig() {
        File dataFile = DataUtils.getDataFile(CharGemDataName);

        // 解析为 Map<String, CharGem>
        Map<String, CharGemConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharGemConfigMap(tempMap);
    }

    public void autoLoadResidentGoodsConfig() {
        File dataFile = DataUtils.getDataFile(ResidentGoodsDataName);

        // 解析为 Map<String, ResidentGoods>
        Map<String, ResidentGoodsConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setResidentGoodsConfigMap(tempMap);
    }

    public void autoLoadCharAffinityTemplateConfig() {
        File dataFile = DataUtils.getDataFile(CharAffinityTemplateDataName);

        // 解析为 Map<String, CharAffinityTemplate>
        Map<String, CharAffinityTemplateConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharAffinityTemplateConfigMap(tempMap);
    }

    public void autoLoadTowerDefenseQuestConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefenseQuestDataName);

        // 解析为 Map<String, TowerDefenseQuest>
        Map<String, TowerDefenseQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefenseQuestConfigMap(tempMap);
    }

    public void autoLoadMangaLoadingConfig() {
        File dataFile = DataUtils.getDataFile(MangaLoadingDataName);

        // 解析为 Map<String, MangaLoading>
        Map<String, MangaLoadingConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMangaLoadingConfigMap(tempMap);
    }

    public void autoLoadCookieLevelConfig() {
        File dataFile = DataUtils.getDataFile(CookieLevelDataName);

        // 解析为 Map<String, CookieLevel>
        Map<String, CookieLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCookieLevelConfigMap(tempMap);
    }

    public void autoLoadGuideConfig() {
        File dataFile = DataUtils.getDataFile(GuideDataName);

        // 解析为 Map<String, Guide>
        Map<String, GuideConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGuideConfigMap(tempMap);
    }

    public void autoLoadForceConfig() {
        File dataFile = DataUtils.getDataFile(ForceDataName);

        // 解析为 Map<String, Force>
        Map<String, ForceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setForceConfigMap(tempMap);
    }

    public void autoLoadStarTowerFloorSetConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerFloorSetDataName);

        // 解析为 Map<String, StarTowerFloorSet>
        Map<String, StarTowerFloorSetConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerFloorSetConfigMap(tempMap);
    }

    public void autoLoadTutorialLevelConfig() {
        File dataFile = DataUtils.getDataFile(TutorialLevelDataName);

        // 解析为 Map<String, TutorialLevel>
        Map<String, TutorialLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTutorialLevelConfigMap(tempMap);
    }

    public void autoLoadActivityStoryEvidenceConfig() {
        File dataFile = DataUtils.getDataFile(ActivityStoryEvidenceDataName);

        // 解析为 Map<String, ActivityStoryEvidence>
        Map<String, ActivityStoryEvidenceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityStoryEvidenceConfigMap(tempMap);
    }

    public void autoLoadCharacterSkinConfig() {
        File dataFile = DataUtils.getDataFile(CharacterSkinDataName);

        // 解析为 Map<String, CharacterSkin>
        Map<String, CharacterSkinConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterSkinConfigMap(tempMap);
    }

    public void autoLoadDestroyObjectSprConfig() {
        File dataFile = DataUtils.getDataFile(DestroyObjectSprDataName);

        // 解析为 Map<String, DestroyObjectSpr>
        Map<String, DestroyObjectSprConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDestroyObjectSprConfigMap(tempMap);
    }

    public void autoLoadEnergyBuyConfig() {
        File dataFile = DataUtils.getDataFile(EnergyBuyDataName);

        // 解析为 Map<String, EnergyBuy>
        Map<String, EnergyBuyConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setEnergyBuyConfigMap(tempMap);
    }

    public void autoLoadTowerDefenseLevelConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefenseLevelDataName);

        // 解析为 Map<String, TowerDefenseLevel>
        Map<String, TowerDefenseLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefenseLevelConfigMap(tempMap);
    }

    public void autoLoadPreviewMonsterGroupConfig() {
        File dataFile = DataUtils.getDataFile(PreviewMonsterGroupDataName);

        // 解析为 Map<String, PreviewMonsterGroup>
        Map<String, PreviewMonsterGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setPreviewMonsterGroupConfigMap(tempMap);
    }

    public void autoLoadMallShopPageConfig() {
        File dataFile = DataUtils.getDataFile(MallShopPageDataName);

        // 解析为 Map<String, MallShopPage>
        Map<String, MallShopPageConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMallShopPageConfigMap(tempMap);
    }

    public void autoLoadDatingStartEndEventConfig() {
        File dataFile = DataUtils.getDataFile(DatingStartEndEventDataName);

        // 解析为 Map<String, DatingStartEndEvent>
        Map<String, DatingStartEndEventConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDatingStartEndEventConfigMap(tempMap);
    }

    public void autoLoadActivityStoryChapterConfig() {
        File dataFile = DataUtils.getDataFile(ActivityStoryChapterDataName);

        // 解析为 Map<String, ActivityStoryChapter>
        Map<String, ActivityStoryChapterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityStoryChapterConfigMap(tempMap);
    }

    public void autoLoadDictionaryDiagramConfig() {
        File dataFile = DataUtils.getDataFile(DictionaryDiagramDataName);

        // 解析为 Map<String, DictionaryDiagram>
        Map<String, DictionaryDiagramConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDictionaryDiagramConfigMap(tempMap);
    }

    public void autoLoadSkillInstanceFloorConfig() {
        File dataFile = DataUtils.getDataFile(SkillInstanceFloorDataName);

        // 解析为 Map<String, SkillInstanceFloor>
        Map<String, SkillInstanceFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setSkillInstanceFloorConfigMap(tempMap);
    }

    public void autoLoadBuffEffectConfig() {
        File dataFile = DataUtils.getDataFile(BuffEffectDataName);

        // 解析为 Map<String, BuffEffect>
        Map<String, BuffEffectConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBuffEffectConfigMap(tempMap);
    }

    public void autoLoadAttributeLimitConfig() {
        File dataFile = DataUtils.getDataFile(AttributeLimitDataName);

        // 解析为 Map<String, AttributeLimit>
        Map<String, AttributeLimitConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAttributeLimitConfigMap(tempMap);
    }

    public void autoLoadDailyInstanceFloorConfig() {
        File dataFile = DataUtils.getDataFile(DailyInstanceFloorDataName);

        // 解析为 Map<String, DailyInstanceFloor>
        Map<String, DailyInstanceFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDailyInstanceFloorConfigMap(tempMap);
    }

    public void autoLoadPeriodicQuestGroupConfig() {
        File dataFile = DataUtils.getDataFile(PeriodicQuestGroupDataName);

        // 解析为 Map<String, PeriodicQuestGroup>
        Map<String, PeriodicQuestGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setPeriodicQuestGroupConfigMap(tempMap);
    }

    public void autoLoadCookieRhythmlResultConfig() {
        File dataFile = DataUtils.getDataFile(CookieRhythmlResultDataName);

        // 解析为 Map<String, CookieRhythmlResult>
        Map<String, CookieRhythmlResultConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCookieRhythmlResultConfigMap(tempMap);
    }

    public void autoLoadCharacterArchiveConfig() {
        File dataFile = DataUtils.getDataFile(CharacterArchiveDataName);

        // 解析为 Map<String, CharacterArchive>
        Map<String, CharacterArchiveConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterArchiveConfigMap(tempMap);
    }

    public void autoLoadNpcAffinityGroupConfig() {
        File dataFile = DataUtils.getDataFile(NpcAffinityGroupDataName);

        // 解析为 Map<String, NpcAffinityGroup>
        Map<String, NpcAffinityGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setNpcAffinityGroupConfigMap(tempMap);
    }

    public void autoLoadInfinityTowerFloorConfig() {
        File dataFile = DataUtils.getDataFile(InfinityTowerFloorDataName);

        // 解析为 Map<String, InfinityTowerFloor>
        Map<String, InfinityTowerFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setInfinityTowerFloorConfigMap(tempMap);
    }

    public void autoLoadActivityShopControlConfig() {
        File dataFile = DataUtils.getDataFile(ActivityShopControlDataName);

        // 解析为 Map<String, ActivityShopControl>
        Map<String, ActivityShopControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityShopControlConfigMap(tempMap);
    }

    public void autoLoadAdControlConfig() {
        File dataFile = DataUtils.getDataFile(AdControlDataName);

        // 解析为 Map<String, AdControl>
        Map<String, AdControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAdControlConfigMap(tempMap);
    }

    public void autoLoadInfinityTowerLevelConfig() {
        File dataFile = DataUtils.getDataFile(InfinityTowerLevelDataName);

        // 解析为 Map<String, InfinityTowerLevel>
        Map<String, InfinityTowerLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setInfinityTowerLevelConfigMap(tempMap);
    }

    public void autoLoadDiscExtraAttributeConfig() {
        File dataFile = DataUtils.getDataFile(DiscExtraAttributeDataName);

        // 解析为 Map<String, DiscExtraAttribute>
        Map<String, DiscExtraAttributeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDiscExtraAttributeConfigMap(tempMap);
    }

    public void autoLoadGachaStorageConfig() {
        File dataFile = DataUtils.getDataFile(GachaStorageDataName);

        // 解析为 Map<String, GachaStorage>
        Map<String, GachaStorageConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGachaStorageConfigMap(tempMap);
    }

    public void autoLoadLoginRewardGroupConfig() {
        File dataFile = DataUtils.getDataFile(LoginRewardGroupDataName);

        // 解析为 Map<String, LoginRewardGroup>
        Map<String, LoginRewardGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setLoginRewardGroupConfigMap(tempMap);
    }

    public void autoLoadAffinityGiftConfig() {
        File dataFile = DataUtils.getDataFile(AffinityGiftDataName);

        // 解析为 Map<String, AffinityGift>
        Map<String, AffinityGiftConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAffinityGiftConfigMap(tempMap);
    }

    public void autoLoadWeeklyQuestActiveConfig() {
        File dataFile = DataUtils.getDataFile(WeeklyQuestActiveDataName);

        // 解析为 Map<String, WeeklyQuestActive>
        Map<String, WeeklyQuestActiveConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setWeeklyQuestActiveConfigMap(tempMap);
    }

    public void autoLoadTowerDefensePotentialConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefensePotentialDataName);

        // 解析为 Map<String, TowerDefensePotential>
        Map<String, TowerDefensePotentialConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefensePotentialConfigMap(tempMap);
    }

    public void autoLoadActivityTaskGroupConfig() {
        File dataFile = DataUtils.getDataFile(ActivityTaskGroupDataName);

        // 解析为 Map<String, ActivityTaskGroup>
        Map<String, ActivityTaskGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityTaskGroupConfigMap(tempMap);
    }

    public void autoLoadLoginRewardControlConfig() {
        File dataFile = DataUtils.getDataFile(LoginRewardControlDataName);

        // 解析为 Map<String, LoginRewardControl>
        Map<String, LoginRewardControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setLoginRewardControlConfigMap(tempMap);
    }

    public void autoLoadTitleConfig() {
        File dataFile = DataUtils.getDataFile(TitleDataName);

        // 解析为 Map<String, Title>
        Map<String, TitleConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTitleConfigMap(tempMap);
    }

    public void autoLoadAssistQuestConfig() {
        File dataFile = DataUtils.getDataFile(AssistQuestDataName);

        // 解析为 Map<String, AssistQuest>
        Map<String, AssistQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAssistQuestConfigMap(tempMap);
    }

    public void autoLoadDailyQuestAwardConfig() {
        File dataFile = DataUtils.getDataFile(DailyQuestAwardDataName);

        // 解析为 Map<String, DailyQuestAward>
        Map<String, DailyQuestAwardConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDailyQuestAwardConfigMap(tempMap);
    }

    public void autoLoadTravelerDuelChallengeControlConfig() {
        File dataFile = DataUtils.getDataFile(TravelerDuelChallengeControlDataName);

        // 解析为 Map<String, TravelerDuelChallengeControl>
        Map<String, TravelerDuelChallengeControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTravelerDuelChallengeControlConfigMap(tempMap);
    }

    public void autoLoadJointDrillQuestConfig() {
        File dataFile = DataUtils.getDataFile(JointDrillQuestDataName);

        // 解析为 Map<String, JointDrillQuest>
        Map<String, JointDrillQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setJointDrillQuestConfigMap(tempMap);
    }

    public void autoLoadMallPackageConfig() {
        File dataFile = DataUtils.getDataFile(MallPackageDataName);

        // 解析为 Map<String, MallPackage>
        Map<String, MallPackageConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMallPackageConfigMap(tempMap);
    }

    public void autoLoadEffectDescConfig() {
        File dataFile = DataUtils.getDataFile(EffectDescDataName);

        // 解析为 Map<String, EffectDesc>
        Map<String, EffectDescConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setEffectDescConfigMap(tempMap);
    }

    public void autoLoadJointDrillAffixConfig() {
        File dataFile = DataUtils.getDataFile(JointDrillAffixDataName);

        // 解析为 Map<String, JointDrillAffix>
        Map<String, JointDrillAffixConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setJointDrillAffixConfigMap(tempMap);
    }

    public void autoLoadGachaTypeConfig() {
        File dataFile = DataUtils.getDataFile(GachaTypeDataName);

        // 解析为 Map<String, GachaType>
        Map<String, GachaTypeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGachaTypeConfigMap(tempMap);
    }

    public void autoLoadSkillConfig() {
        File dataFile = DataUtils.getDataFile(SkillDataName);

        // 解析为 Map<String, Skill>
        Map<String, SkillConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setSkillConfigMap(tempMap);
    }

    public void autoLoadMallPackagePageConfig() {
        File dataFile = DataUtils.getDataFile(MallPackagePageDataName);

        // 解析为 Map<String, MallPackagePage>
        Map<String, MallPackagePageConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMallPackagePageConfigMap(tempMap);
    }

    public void autoLoadSkillInstanceTypeConfig() {
        File dataFile = DataUtils.getDataFile(SkillInstanceTypeDataName);

        // 解析为 Map<String, SkillInstanceType>
        Map<String, SkillInstanceTypeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setSkillInstanceTypeConfigMap(tempMap);
    }

    public void autoLoadInfinityTowerConfig() {
        File dataFile = DataUtils.getDataFile(InfinityTowerDataName);

        // 解析为 Map<String, InfinityTower>
        Map<String, InfinityTowerConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setInfinityTowerConfigMap(tempMap);
    }

    public void autoLoadSubNoteSkillPromoteGroupConfig() {
        File dataFile = DataUtils.getDataFile(SubNoteSkillPromoteGroupDataName);

        // 解析为 Map<String, SubNoteSkillPromoteGroup>
        Map<String, SubNoteSkillPromoteGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setSubNoteSkillPromoteGroupConfigMap(tempMap);
    }

    public void autoLoadDictionaryTabConfig() {
        File dataFile = DataUtils.getDataFile(DictionaryTabDataName);

        // 解析为 Map<String, DictionaryTab>
        Map<String, DictionaryTabConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDictionaryTabConfigMap(tempMap);
    }

    public void autoLoadCharacterVoiceControlConfig() {
        File dataFile = DataUtils.getDataFile(CharacterVoiceControlDataName);

        // 解析为 Map<String, CharacterVoiceControl>
        Map<String, CharacterVoiceControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterVoiceControlConfigMap(tempMap);
    }

    public void autoLoadTowerDefenseTeamExpConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefenseTeamExpDataName);

        // 解析为 Map<String, TowerDefenseTeamExp>
        Map<String, TowerDefenseTeamExpConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefenseTeamExpConfigMap(tempMap);
    }

    public void autoLoadUiTextConfig() {
        File dataFile = DataUtils.getDataFile(UiTextDataName);

        // 解析为 Map<String, UiText>
        Map<String, UiTextConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setUiTextConfigMap(tempMap);
    }

    public void autoLoadErrorCodeConfig() {
        File dataFile = DataUtils.getDataFile(ErrorCodeDataName);

        // 解析为 Map<String, ErrorCode>
        Map<String, ErrorCodeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setErrorCodeConfigMap(tempMap);
    }

    public void autoLoadInfinityTowerDifficultyConfig() {
        File dataFile = DataUtils.getDataFile(InfinityTowerDifficultyDataName);

        // 解析为 Map<String, InfinityTowerDifficulty>
        Map<String, InfinityTowerDifficultyConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setInfinityTowerDifficultyConfigMap(tempMap);
    }

    public void autoLoadStorySetSectionConfig() {
        File dataFile = DataUtils.getDataFile(StorySetSectionDataName);

        // 解析为 Map<String, StorySetSection>
        Map<String, StorySetSectionConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStorySetSectionConfigMap(tempMap);
    }

    public void autoLoadBuffValueConfig() {
        File dataFile = DataUtils.getDataFile(BuffValueDataName);

        // 解析为 Map<String, BuffValue>
        Map<String, BuffValueConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBuffValueConfigMap(tempMap);
    }

    public void autoLoadCharacterArchiveContentConfig() {
        File dataFile = DataUtils.getDataFile(CharacterArchiveContentDataName);

        // 解析为 Map<String, CharacterArchiveContent>
        Map<String, CharacterArchiveContentConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterArchiveContentConfigMap(tempMap);
    }

    public void autoLoadChestConfig() {
        File dataFile = DataUtils.getDataFile(ChestDataName);

        // 解析为 Map<String, Chest>
        Map<String, ChestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setChestConfigMap(tempMap);
    }

    public void autoLoadNpcSkinConfig() {
        File dataFile = DataUtils.getDataFile(NpcSkinDataName);

        // 解析为 Map<String, NpcSkin>
        Map<String, NpcSkinConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setNpcSkinConfigMap(tempMap);
    }

    public void autoLoadWordConfig() {
        File dataFile = DataUtils.getDataFile(WordDataName);

        // 解析为 Map<String, Word>
        Map<String, WordConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setWordConfigMap(tempMap);
    }

    public void autoLoadFloorBuffConfig() {
        File dataFile = DataUtils.getDataFile(FloorBuffDataName);

        // 解析为 Map<String, FloorBuff>
        Map<String, FloorBuffConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setFloorBuffConfigMap(tempMap);
    }

    public void autoLoadMainScreenCgConfig() {
        File dataFile = DataUtils.getDataFile(MainScreenCgDataName);

        // 解析为 Map<String, MainScreenCg>
        Map<String, MainScreenCgConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMainScreenCgConfigMap(tempMap);
    }

    public void autoLoadMallMonthlyCardConfig() {
        File dataFile = DataUtils.getDataFile(MallMonthlyCardDataName);

        // 解析为 Map<String, MallMonthlyCard>
        Map<String, MallMonthlyCardConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMallMonthlyCardConfigMap(tempMap);
    }

    public void autoLoadPeriodicQuestControlConfig() {
        File dataFile = DataUtils.getDataFile(PeriodicQuestControlDataName);

        // 解析为 Map<String, PeriodicQuestControl>
        Map<String, PeriodicQuestControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setPeriodicQuestControlConfigMap(tempMap);
    }

    public void autoLoadRegionBossLevelConfig() {
        File dataFile = DataUtils.getDataFile(RegionBossLevelDataName);

        // 解析为 Map<String, RegionBossLevel>
        Map<String, RegionBossLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setRegionBossLevelConfigMap(tempMap);
    }

    public void autoLoadLevelQuestTargetConfig() {
        File dataFile = DataUtils.getDataFile(LevelQuestTargetDataName);

        // 解析为 Map<String, LevelQuestTarget>
        Map<String, LevelQuestTargetConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setLevelQuestTargetConfigMap(tempMap);
    }

    public void autoLoadPotentialConfig() {
        File dataFile = DataUtils.getDataFile(PotentialDataName);

        // 解析为 Map<String, Potential>
        Map<String, PotentialConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setPotentialConfigMap(tempMap);
    }

    public void autoLoadCharRaritySequenceConfig() {
        File dataFile = DataUtils.getDataFile(CharRaritySequenceDataName);

        // 解析为 Map<String, CharRaritySequence>
        Map<String, CharRaritySequenceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharRaritySequenceConfigMap(tempMap);
    }

    public void autoLoadCharGemSlotControlConfig() {
        File dataFile = DataUtils.getDataFile(CharGemSlotControlDataName);

        // 解析为 Map<String, CharGemSlotControl>
        Map<String, CharGemSlotControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharGemSlotControlConfigMap(tempMap);
    }

    public void autoLoadVampireRankSeasonConfig() {
        File dataFile = DataUtils.getDataFile(VampireRankSeasonDataName);

        // 解析为 Map<String, VampireRankSeason>
        Map<String, VampireRankSeasonConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireRankSeasonConfigMap(tempMap);
    }

    public void autoLoadBreakOutEnemySprConfig() {
        File dataFile = DataUtils.getDataFile(BreakOutEnemySprDataName);

        // 解析为 Map<String, BreakOutEnemySpr>
        Map<String, BreakOutEnemySprConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBreakOutEnemySprConfigMap(tempMap);
    }

    public void autoLoadGamepadActionConfig() {
        File dataFile = DataUtils.getDataFile(GamepadActionDataName);

        // 解析为 Map<String, GamepadAction>
        Map<String, GamepadActionConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGamepadActionConfigMap(tempMap);
    }

    public void autoLoadItemConfig() {
        File dataFile = DataUtils.getDataFile(ItemDataName);

        // 解析为 Map<String, Item>
        Map<String, ItemConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setItemConfigMap(tempMap);
    }

    public void autoLoadMallShopConfig() {
        File dataFile = DataUtils.getDataFile(MallShopDataName);

        // 解析为 Map<String, MallShop>
        Map<String, MallShopConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMallShopConfigMap(tempMap);
    }

    public void autoLoadStarTowerBookFateCardQuestConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerBookFateCardQuestDataName);

        // 解析为 Map<String, StarTowerBookFateCardQuest>
        Map<String, StarTowerBookFateCardQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerBookFateCardQuestConfigMap(tempMap);
    }

    public void autoLoadSubNoteSkillConfig() {
        File dataFile = DataUtils.getDataFile(SubNoteSkillDataName);

        // 解析为 Map<String, SubNoteSkill>
        Map<String, SubNoteSkillConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setSubNoteSkillConfigMap(tempMap);
    }

    public void autoLoadStarTowerShopGoodsConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerShopGoodsDataName);

        // 解析为 Map<String, StarTowerShopGoods>
        Map<String, StarTowerShopGoodsConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerShopGoodsConfigMap(tempMap);
    }

    public void autoLoadAgentTabConfig() {
        File dataFile = DataUtils.getDataFile(AgentTabDataName);

        // 解析为 Map<String, AgentTab>
        Map<String, AgentTabConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAgentTabConfigMap(tempMap);
    }

    public void autoLoadMonsterSkinConfig() {
        File dataFile = DataUtils.getDataFile(MonsterSkinDataName);

        // 解析为 Map<String, MonsterSkin>
        Map<String, MonsterSkinConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMonsterSkinConfigMap(tempMap);
    }

    public void autoLoadDiscPromoteLimitConfig() {
        File dataFile = DataUtils.getDataFile(DiscPromoteLimitDataName);

        // 解析为 Map<String, DiscPromoteLimit>
        Map<String, DiscPromoteLimitConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDiscPromoteLimitConfigMap(tempMap);
    }

    public void autoLoadTowerDefenseFloorConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefenseFloorDataName);

        // 解析为 Map<String, TowerDefenseFloor>
        Map<String, TowerDefenseFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefenseFloorConfigMap(tempMap);
    }

    public void autoLoadAgentConfig() {
        File dataFile = DataUtils.getDataFile(AgentDataName);

        // 解析为 Map<String, Agent>
        Map<String, AgentConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAgentConfigMap(tempMap);
    }

    public void autoLoadItemPackMarkConfig() {
        File dataFile = DataUtils.getDataFile(ItemPackMarkDataName);

        // 解析为 Map<String, ItemPackMark>
        Map<String, ItemPackMarkConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setItemPackMarkConfigMap(tempMap);
    }

    public void autoLoadMonsterManualConfig() {
        File dataFile = DataUtils.getDataFile(MonsterManualDataName);

        // 解析为 Map<String, MonsterManual>
        Map<String, MonsterManualConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMonsterManualConfigMap(tempMap);
    }

    public void autoLoadStarTowerGrowthGroupConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerGrowthGroupDataName);

        // 解析为 Map<String, StarTowerGrowthGroup>
        Map<String, StarTowerGrowthGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerGrowthGroupConfigMap(tempMap);
    }

    public void autoLoadAreaEffectConfig() {
        File dataFile = DataUtils.getDataFile(AreaEffectDataName);

        // 解析为 Map<String, AreaEffect>
        Map<String, AreaEffectConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAreaEffectConfigMap(tempMap);
    }

    public void autoLoadPlotConfig() {
        File dataFile = DataUtils.getDataFile(PlotDataName);

        // 解析为 Map<String, Plot>
        Map<String, PlotConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setPlotConfigMap(tempMap);
    }

    public void autoLoadInteractiveActionConfig() {
        File dataFile = DataUtils.getDataFile(InteractiveActionDataName);

        // 解析为 Map<String, InteractiveAction>
        Map<String, InteractiveActionConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setInteractiveActionConfigMap(tempMap);
    }

    public void autoLoadPopUpSequenceConfig() {
        File dataFile = DataUtils.getDataFile(PopUpSequenceDataName);

        // 解析为 Map<String, PopUpSequence>
        Map<String, PopUpSequenceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setPopUpSequenceConfigMap(tempMap);
    }

    public void autoLoadDatingBranchConfig() {
        File dataFile = DataUtils.getDataFile(DatingBranchDataName);

        // 解析为 Map<String, DatingBranch>
        Map<String, DatingBranchConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDatingBranchConfigMap(tempMap);
    }

    public void autoLoadMonsterValueTempleteAdjustConfig() {
        File dataFile = DataUtils.getDataFile(MonsterValueTempleteAdjustDataName);

        // 解析为 Map<String, MonsterValueTempleteAdjust>
        Map<String, MonsterValueTempleteAdjustConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMonsterValueTempleteAdjustConfigMap(tempMap);
    }

    public void autoLoadVoDirectoryConfig() {
        File dataFile = DataUtils.getDataFile(VoDirectoryDataName);

        // 解析为 Map<String, VoDirectory>
        Map<String, VoDirectoryConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVoDirectoryConfigMap(tempMap);
    }

    public void autoLoadDropConfig() {
        File dataFile = DataUtils.getDataFile(DropDataName);

        // 解析为 Map<String, Drop>
        Map<String, DropConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDropConfigMap(tempMap);
    }

    public void autoLoadStoryConditionConfig() {
        File dataFile = DataUtils.getDataFile(StoryConditionDataName);

        // 解析为 Map<String, StoryCondition>
        Map<String, StoryConditionConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStoryConditionConfigMap(tempMap);
    }

    public void autoLoadVampireSurvivorConfig() {
        File dataFile = DataUtils.getDataFile(VampireSurvivorDataName);

        // 解析为 Map<String, VampireSurvivor>
        Map<String, VampireSurvivorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireSurvivorConfigMap(tempMap);
    }

    public void autoLoadEnumDescConfig() {
        File dataFile = DataUtils.getDataFile(EnumDescDataName);

        // 解析为 Map<String, EnumDesc>
        Map<String, EnumDescConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setEnumDescConfigMap(tempMap);
    }

    public void autoLoadTrialFloorConfig() {
        File dataFile = DataUtils.getDataFile(TrialFloorDataName);

        // 解析为 Map<String, TrialFloor>
        Map<String, TrialFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTrialFloorConfigMap(tempMap);
    }

    public void autoLoadStarTowerComboConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerComboDataName);

        // 解析为 Map<String, StarTowerCombo>
        Map<String, StarTowerComboConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerComboConfigMap(tempMap);
    }

    public void autoLoadEndSceneTypeConfig() {
        File dataFile = DataUtils.getDataFile(EndSceneTypeDataName);

        // 解析为 Map<String, EndSceneType>
        Map<String, EndSceneTypeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setEndSceneTypeConfigMap(tempMap);
    }

    public void autoLoadScoreBossAbilityConfig() {
        File dataFile = DataUtils.getDataFile(ScoreBossAbilityDataName);

        // 解析为 Map<String, ScoreBossAbility>
        Map<String, ScoreBossAbilityConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScoreBossAbilityConfigMap(tempMap);
    }

    public void autoLoadStarTowerMapConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerMapDataName);

        // 解析为 Map<String, StarTowerMap>
        Map<String, StarTowerMapConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerMapConfigMap(tempMap);
    }

    public void autoLoadCharGemInstanceFloorConfig() {
        File dataFile = DataUtils.getDataFile(CharGemInstanceFloorDataName);

        // 解析为 Map<String, CharGemInstanceFloor>
        Map<String, CharGemInstanceFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharGemInstanceFloorConfigMap(tempMap);
    }

    public void autoLoadPlayerHeadConfig() {
        File dataFile = DataUtils.getDataFile(PlayerHeadDataName);

        // 解析为 Map<String, PlayerHead>
        Map<String, PlayerHeadConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setPlayerHeadConfigMap(tempMap);
    }

    public void autoLoadTopBarConfig() {
        File dataFile = DataUtils.getDataFile(TopBarDataName);

        // 解析为 Map<String, TopBar>
        Map<String, TopBarConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTopBarConfigMap(tempMap);
    }

    public void autoLoadContentWordConfig() {
        File dataFile = DataUtils.getDataFile(ContentWordDataName);

        // 解析为 Map<String, ContentWord>
        Map<String, ContentWordConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setContentWordConfigMap(tempMap);
    }

    public void autoLoadVampireEnemySetConfig() {
        File dataFile = DataUtils.getDataFile(VampireEnemySetDataName);

        // 解析为 Map<String, VampireEnemySet>
        Map<String, VampireEnemySetConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireEnemySetConfigMap(tempMap);
    }

    public void autoLoadScoreBossControlConfig() {
        File dataFile = DataUtils.getDataFile(ScoreBossControlDataName);

        // 解析为 Map<String, ScoreBossControl>
        Map<String, ScoreBossControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScoreBossControlConfigMap(tempMap);
    }

    public void autoLoadMiningStoryConfig() {
        File dataFile = DataUtils.getDataFile(MiningStoryDataName);

        // 解析为 Map<String, MiningStory>
        Map<String, MiningStoryConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMiningStoryConfigMap(tempMap);
    }

    public void autoLoadCharGradeConfig() {
        File dataFile = DataUtils.getDataFile(CharGradeDataName);

        // 解析为 Map<String, CharGrade>
        Map<String, CharGradeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharGradeConfigMap(tempMap);
    }

    public void autoLoadInfinityTowerAffixConfig() {
        File dataFile = DataUtils.getDataFile(InfinityTowerAffixDataName);

        // 解析为 Map<String, InfinityTowerAffix>
        Map<String, InfinityTowerAffixConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setInfinityTowerAffixConfigMap(tempMap);
    }

    public void autoLoadPeriodicQuestConfig() {
        File dataFile = DataUtils.getDataFile(PeriodicQuestDataName);

        // 解析为 Map<String, PeriodicQuest>
        Map<String, PeriodicQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setPeriodicQuestConfigMap(tempMap);
    }

    public void autoLoadActivityLevelsLevelConfig() {
        File dataFile = DataUtils.getDataFile(ActivityLevelsLevelDataName);

        // 解析为 Map<String, ActivityLevelsLevel>
        Map<String, ActivityLevelsLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityLevelsLevelConfigMap(tempMap);
    }

    public void autoLoadBattlePassLevelConfig() {
        File dataFile = DataUtils.getDataFile(BattlePassLevelDataName);

        // 解析为 Map<String, BattlePassLevel>
        Map<String, BattlePassLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBattlePassLevelConfigMap(tempMap);
    }

    public void autoLoadTowerDefenseQuestGroupConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefenseQuestGroupDataName);

        // 解析为 Map<String, TowerDefenseQuestGroup>
        Map<String, TowerDefenseQuestGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefenseQuestGroupConfigMap(tempMap);
    }

    public void autoLoadDiscStrengthenConfig() {
        File dataFile = DataUtils.getDataFile(DiscStrengthenDataName);

        // 解析为 Map<String, DiscStrengthen>
        Map<String, DiscStrengthenConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDiscStrengthenConfigMap(tempMap);
    }

    public void autoLoadMonsterConfig() {
        File dataFile = DataUtils.getDataFile(MonsterDataName);

        // 解析为 Map<String, Monster>
        Map<String, MonsterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMonsterConfigMap(tempMap);
    }

    public void autoLoadChatConfig() {
        File dataFile = DataUtils.getDataFile(ChatDataName);

        // 解析为 Map<String, Chat>
        Map<String, ChatConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setChatConfigMap(tempMap);
    }

    public void autoLoadVampireMapConfig() {
        File dataFile = DataUtils.getDataFile(VampireMapDataName);

        // 解析为 Map<String, VampireMap>
        Map<String, VampireMapConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireMapConfigMap(tempMap);
    }

    public void autoLoadJointDrillFloorConfig() {
        File dataFile = DataUtils.getDataFile(JointDrillFloorDataName);

        // 解析为 Map<String, JointDrillFloor>
        Map<String, JointDrillFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setJointDrillFloorConfigMap(tempMap);
    }

    public void autoLoadStarTowerMonsterBornGroupConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerMonsterBornGroupDataName);

        // 解析为 Map<String, StarTowerMonsterBornGroup>
        Map<String, StarTowerMonsterBornGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerMonsterBornGroupConfigMap(tempMap);
    }

    public void autoLoadBannerConfig() {
        File dataFile = DataUtils.getDataFile(BannerDataName);

        // 解析为 Map<String, Banner>
        Map<String, BannerConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBannerConfigMap(tempMap);
    }

    public void autoLoadStarTowerConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerDataName);

        // 解析为 Map<String, StarTower>
        Map<String, StarTowerConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerConfigMap(tempMap);
    }

    public void autoLoadChapterConfig() {
        File dataFile = DataUtils.getDataFile(ChapterDataName);

        // 解析为 Map<String, Chapter>
        Map<String, ChapterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setChapterConfigMap(tempMap);
    }

    public void autoLoadInfinityTowerMsgConfig() {
        File dataFile = DataUtils.getDataFile(InfinityTowerMsgDataName);

        // 解析为 Map<String, InfinityTowerMsg>
        Map<String, InfinityTowerMsgConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setInfinityTowerMsgConfigMap(tempMap);
    }

    public void autoLoadBattlePassRewardConfig() {
        File dataFile = DataUtils.getDataFile(BattlePassRewardDataName);

        // 解析为 Map<String, BattlePassReward>
        Map<String, BattlePassRewardConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBattlePassRewardConfigMap(tempMap);
    }

    public void autoLoadCharacterArchiveBaseInfoConfig() {
        File dataFile = DataUtils.getDataFile(CharacterArchiveBaseInfoDataName);

        // 解析为 Map<String, CharacterArchiveBaseInfo>
        Map<String, CharacterArchiveBaseInfoConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterArchiveBaseInfoConfigMap(tempMap);
    }

    public void autoLoadTrapConfig() {
        File dataFile = DataUtils.getDataFile(TrapDataName);

        // 解析为 Map<String, Trap>
        Map<String, TrapConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTrapConfigMap(tempMap);
    }

    public void autoLoadTrialDiscConfig() {
        File dataFile = DataUtils.getDataFile(TrialDiscDataName);

        // 解析为 Map<String, TrialDisc>
        Map<String, TrialDiscConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTrialDiscConfigMap(tempMap);
    }

    public void autoLoadVampireFloorConfig() {
        File dataFile = DataUtils.getDataFile(VampireFloorDataName);

        // 解析为 Map<String, VampireFloor>
        Map<String, VampireFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireFloorConfigMap(tempMap);
    }

    public void autoLoadDatingLandmarkEventConfig() {
        File dataFile = DataUtils.getDataFile(DatingLandmarkEventDataName);

        // 解析为 Map<String, DatingLandmarkEvent>
        Map<String, DatingLandmarkEventConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDatingLandmarkEventConfigMap(tempMap);
    }

    public void autoLoadDiscTagConfig() {
        File dataFile = DataUtils.getDataFile(DiscTagDataName);

        // 解析为 Map<String, DiscTag>
        Map<String, DiscTagConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDiscTagConfigMap(tempMap);
    }

    public void autoLoadScoreBossBattleThresholdConfig() {
        File dataFile = DataUtils.getDataFile(ScoreBossBattleThresholdDataName);

        // 解析为 Map<String, ScoreBossBattleThreshold>
        Map<String, ScoreBossBattleThresholdConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScoreBossBattleThresholdConfigMap(tempMap);
    }

    public void autoLoadGachaConfig() {
        File dataFile = DataUtils.getDataFile(GachaDataName);

        // 解析为 Map<String, Gacha>
        Map<String, GachaConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGachaConfigMap(tempMap);
    }

    public void autoLoadMonsterAttributeContactConfig() {
        File dataFile = DataUtils.getDataFile(MonsterAttributeContactDataName);

        // 解析为 Map<String, MonsterAttributeContact>
        Map<String, MonsterAttributeContactConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMonsterAttributeContactConfigMap(tempMap);
    }

    public void autoLoadMonsterAiConfig() {
        File dataFile = DataUtils.getDataFile(MonsterAiDataName);

        // 解析为 Map<String, MonsterAi>
        Map<String, MonsterAiConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMonsterAiConfigMap(tempMap);
    }

    public void autoLoadStarTowerCombatEventConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerCombatEventDataName);

        // 解析为 Map<String, StarTowerCombatEvent>
        Map<String, StarTowerCombatEventConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerCombatEventConfigMap(tempMap);
    }

    public void autoLoadVampireEnemySpAttrConfig() {
        File dataFile = DataUtils.getDataFile(VampireEnemySpAttrDataName);

        // 解析为 Map<String, VampireEnemySpAttr>
        Map<String, VampireEnemySpAttrConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireEnemySpAttrConfigMap(tempMap);
    }

    public void autoLoadStarTowerGrowthNodeConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerGrowthNodeDataName);

        // 解析为 Map<String, StarTowerGrowthNode>
        Map<String, StarTowerGrowthNodeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerGrowthNodeConfigMap(tempMap);
    }

    public void autoLoadDailyQuestConfig() {
        File dataFile = DataUtils.getDataFile(DailyQuestDataName);

        // 解析为 Map<String, DailyQuest>
        Map<String, DailyQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDailyQuestConfigMap(tempMap);
    }

    public void autoLoadBdConvertConfig() {
        File dataFile = DataUtils.getDataFile(BdConvertDataName);

        // 解析为 Map<String, BdConvert>
        Map<String, BdConvertConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBdConvertConfigMap(tempMap);
    }

    public void autoLoadBdConvertControlConfig() {
        File dataFile = DataUtils.getDataFile(BdConvertControlDataName);

        // 解析为 Map<String, BdConvertControl>
        Map<String, BdConvertControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBdConvertControlConfigMap(tempMap);
    }

    public void autoLoadScoreBossLevelConfig() {
        File dataFile = DataUtils.getDataFile(ScoreBossLevelDataName);

        // 解析为 Map<String, ScoreBossLevel>
        Map<String, ScoreBossLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScoreBossLevelConfigMap(tempMap);
    }

    public void autoLoadMonsterActionBranchConfig() {
        File dataFile = DataUtils.getDataFile(MonsterActionBranchDataName);

        // 解析为 Map<String, MonsterActionBranch>
        Map<String, MonsterActionBranchConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMonsterActionBranchConfigMap(tempMap);
    }

    public void autoLoadGmOrderConfig() {
        File dataFile = DataUtils.getDataFile(GmOrderDataName);

        // 解析为 Map<String, GmOrder>
        Map<String, GmOrderConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGmOrderConfigMap(tempMap);
    }

    public void autoLoadStarTowerStageConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerStageDataName);

        // 解析为 Map<String, StarTowerStage>
        Map<String, StarTowerStageConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerStageConfigMap(tempMap);
    }

    public void autoLoadDestroyObjectConfig() {
        File dataFile = DataUtils.getDataFile(DestroyObjectDataName);

        // 解析为 Map<String, DestroyObject>
        Map<String, DestroyObjectConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDestroyObjectConfigMap(tempMap);
    }

    public void autoLoadJumpToConfig() {
        File dataFile = DataUtils.getDataFile(JumpToDataName);

        // 解析为 Map<String, JumpTo>
        Map<String, JumpToConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setJumpToConfigMap(tempMap);
    }

    public void autoLoadStarTowerBuildRankConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerBuildRankDataName);

        // 解析为 Map<String, StarTowerBuildRank>
        Map<String, StarTowerBuildRankConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerBuildRankConfigMap(tempMap);
    }

    public void autoLoadCharacterDesConfig() {
        File dataFile = DataUtils.getDataFile(CharacterDesDataName);

        // 解析为 Map<String, CharacterDes>
        Map<String, CharacterDesConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterDesConfigMap(tempMap);
    }

    public void autoLoadStarTowerEventOptionActionConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerEventOptionActionDataName);

        // 解析为 Map<String, StarTowerEventOptionAction>
        Map<String, StarTowerEventOptionActionConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerEventOptionActionConfigMap(tempMap);
    }

    public void autoLoadStarTowerMapMaxNumPerStageConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerMapMaxNumPerStageDataName);

        // 解析为 Map<String, StarTowerMapMaxNumPerStage>
        Map<String, StarTowerMapMaxNumPerStageConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerMapMaxNumPerStageConfigMap(tempMap);
    }

    public void autoLoadCharPotentialConfig() {
        File dataFile = DataUtils.getDataFile(CharPotentialDataName);

        // 解析为 Map<String, CharPotential>
        Map<String, CharPotentialConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharPotentialConfigMap(tempMap);
    }

    public void autoLoadBreakOutCharacterConfig() {
        File dataFile = DataUtils.getDataFile(BreakOutCharacterDataName);

        // 解析为 Map<String, BreakOutCharacter>
        Map<String, BreakOutCharacterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBreakOutCharacterConfigMap(tempMap);
    }

    public void autoLoadCharGetLinesConfig() {
        File dataFile = DataUtils.getDataFile(CharGetLinesDataName);

        // 解析为 Map<String, CharGetLines>
        Map<String, CharGetLinesConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharGetLinesConfigMap(tempMap);
    }

    public void autoLoadEventOptionsRulesConfig() {
        File dataFile = DataUtils.getDataFile(EventOptionsRulesDataName);

        // 解析为 Map<String, EventOptionsRules>
        Map<String, EventOptionsRulesConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setEventOptionsRulesConfigMap(tempMap);
    }

    public void autoLoadInfinityTowerEnemySetConfig() {
        File dataFile = DataUtils.getDataFile(InfinityTowerEnemySetDataName);

        // 解析为 Map<String, InfinityTowerEnemySet>
        Map<String, InfinityTowerEnemySetConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setInfinityTowerEnemySetConfigMap(tempMap);
    }

    public void autoLoadStoryEvidenceConfig() {
        File dataFile = DataUtils.getDataFile(StoryEvidenceDataName);

        // 解析为 Map<String, StoryEvidence>
        Map<String, StoryEvidenceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStoryEvidenceConfigMap(tempMap);
    }

    public void autoLoadStarTowerBookEventRewardConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerBookEventRewardDataName);

        // 解析为 Map<String, StarTowerBookEventReward>
        Map<String, StarTowerBookEventRewardConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerBookEventRewardConfigMap(tempMap);
    }

    public void autoLoadDailyInstanceRewardGroupConfig() {
        File dataFile = DataUtils.getDataFile(DailyInstanceRewardGroupDataName);

        // 解析为 Map<String, DailyInstanceRewardGroup>
        Map<String, DailyInstanceRewardGroupConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDailyInstanceRewardGroupConfigMap(tempMap);
    }

    public void autoLoadDiscConfig() {
        File dataFile = DataUtils.getDataFile(DiscDataName);

        // 解析为 Map<String, Disc>
        Map<String, DiscConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDiscConfigMap(tempMap);
    }

    public void autoLoadProductionConfig() {
        File dataFile = DataUtils.getDataFile(ProductionDataName);

        // 解析为 Map<String, Production>
        Map<String, ProductionConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setProductionConfigMap(tempMap);
    }

    public void autoLoadVampireTalentConfig() {
        File dataFile = DataUtils.getDataFile(VampireTalentDataName);

        // 解析为 Map<String, VampireTalent>
        Map<String, VampireTalentConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireTalentConfigMap(tempMap);
    }

    public void autoLoadWeightParameterConfig() {
        File dataFile = DataUtils.getDataFile(WeightParameterDataName);

        // 解析为 Map<String, WeightParameter>
        Map<String, WeightParameterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setWeightParameterConfigMap(tempMap);
    }

    public void autoLoadDiscItemExpConfig() {
        File dataFile = DataUtils.getDataFile(DiscItemExpDataName);

        // 解析为 Map<String, DiscItemExp>
        Map<String, DiscItemExpConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDiscItemExpConfigMap(tempMap);
    }

    public void autoLoadStarTowerEventActionConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerEventActionDataName);

        // 解析为 Map<String, StarTowerEventAction>
        Map<String, StarTowerEventActionConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerEventActionConfigMap(tempMap);
    }

    public void autoLoadTrialCharacterConfig() {
        File dataFile = DataUtils.getDataFile(TrialCharacterDataName);

        // 解析为 Map<String, TrialCharacter>
        Map<String, TrialCharacterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTrialCharacterConfigMap(tempMap);
    }

    public void autoLoadStarTowerDropItemConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerDropItemDataName);

        // 解析为 Map<String, StarTowerDropItem>
        Map<String, StarTowerDropItemConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerDropItemConfigMap(tempMap);
    }

    public void autoLoadBattlePassQuestConfig() {
        File dataFile = DataUtils.getDataFile(BattlePassQuestDataName);

        // 解析为 Map<String, BattlePassQuest>
        Map<String, BattlePassQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBattlePassQuestConfigMap(tempMap);
    }

    public void autoLoadCharacterConfig() {
        File dataFile = DataUtils.getDataFile(CharacterDataName);

        // 解析为 Map<String, Character>
        Map<String, CharacterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterConfigMap(tempMap);
    }

    public void autoLoadJointDrillBattleThresholdConfig() {
        File dataFile = DataUtils.getDataFile(JointDrillBattleThresholdDataName);

        // 解析为 Map<String, JointDrillBattleThreshold>
        Map<String, JointDrillBattleThresholdConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setJointDrillBattleThresholdConfigMap(tempMap);
    }

    public void autoLoadStarTowerBookEntranceConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerBookEntranceDataName);

        // 解析为 Map<String, StarTowerBookEntrance>
        Map<String, StarTowerBookEntranceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerBookEntranceConfigMap(tempMap);
    }

    public void autoLoadEffectValueConfig() {
        File dataFile = DataUtils.getDataFile(EffectValueDataName);

        // 解析为 Map<String, EffectValue>
        Map<String, EffectValueConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setEffectValueConfigMap(tempMap);
    }

    public void autoLoadWorldClassConfig() {
        File dataFile = DataUtils.getDataFile(WorldClassDataName);

        // 解析为 Map<String, WorldClass>
        Map<String, WorldClassConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setWorldClassConfigMap(tempMap);
    }

    public void autoLoadTravelerDuelFloorConfig() {
        File dataFile = DataUtils.getDataFile(TravelerDuelFloorDataName);

        // 解析为 Map<String, TravelerDuelFloor>
        Map<String, TravelerDuelFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTravelerDuelFloorConfigMap(tempMap);
    }

    public void autoLoadGamepadButtonConfig() {
        File dataFile = DataUtils.getDataFile(GamepadButtonDataName);

        // 解析为 Map<String, GamepadButton>
        Map<String, GamepadButtonConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGamepadButtonConfigMap(tempMap);
    }

    public void autoLoadOnceAdditionalAttributeValueConfig() {
        File dataFile = DataUtils.getDataFile(OnceAdditionalAttributeValueDataName);

        // 解析为 Map<String, OnceAdditionalAttributeValue>
        Map<String, OnceAdditionalAttributeValueConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setOnceAdditionalAttributeValueConfigMap(tempMap);
    }

    public void autoLoadStarTowerTeamExpConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerTeamExpDataName);

        // 解析为 Map<String, StarTowerTeamExp>
        Map<String, StarTowerTeamExpConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerTeamExpConfigMap(tempMap);
    }

    public void autoLoadTravelerDuelBossLevelConfig() {
        File dataFile = DataUtils.getDataFile(TravelerDuelBossLevelDataName);

        // 解析为 Map<String, TravelerDuelBossLevel>
        Map<String, TravelerDuelBossLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTravelerDuelBossLevelConfigMap(tempMap);
    }

    public void autoLoadEventOptionsConfig() {
        File dataFile = DataUtils.getDataFile(EventOptionsDataName);

        // 解析为 Map<String, EventOptions>
        Map<String, EventOptionsConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setEventOptionsConfigMap(tempMap);
    }

    public void autoLoadSkillInstanceConfig() {
        File dataFile = DataUtils.getDataFile(SkillInstanceDataName);

        // 解析为 Map<String, SkillInstance>
        Map<String, SkillInstanceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setSkillInstanceConfigMap(tempMap);
    }

    public void autoLoadWeekBossTypeConfig() {
        File dataFile = DataUtils.getDataFile(WeekBossTypeDataName);

        // 解析为 Map<String, WeekBossType>
        Map<String, WeekBossTypeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setWeekBossTypeConfigMap(tempMap);
    }

    public void autoLoadActivityTaskConfig() {
        File dataFile = DataUtils.getDataFile(ActivityTaskDataName);

        // 解析为 Map<String, ActivityTask>
        Map<String, ActivityTaskConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityTaskConfigMap(tempMap);
    }

    public void autoLoadTestCharacterAttConfig() {
        File dataFile = DataUtils.getDataFile(TestCharacterAttDataName);

        // 解析为 Map<String, TestCharacterAtt>
        Map<String, TestCharacterAttConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTestCharacterAttConfigMap(tempMap);
    }

    public void autoLoadDiscIpConfig() {
        File dataFile = DataUtils.getDataFile(DiscIpDataName);

        // 解析为 Map<String, DiscIp>
        Map<String, DiscIpConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDiscIpConfigMap(tempMap);
    }

    public void autoLoadLevelQuestConfig() {
        File dataFile = DataUtils.getDataFile(LevelQuestDataName);

        // 解析为 Map<String, LevelQuest>
        Map<String, LevelQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setLevelQuestConfigMap(tempMap);
    }

    public void autoLoadResidentShopConfig() {
        File dataFile = DataUtils.getDataFile(ResidentShopDataName);

        // 解析为 Map<String, ResidentShop>
        Map<String, ResidentShopConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setResidentShopConfigMap(tempMap);
    }

    public void autoLoadDailyInstanceTypeConfig() {
        File dataFile = DataUtils.getDataFile(DailyInstanceTypeDataName);

        // 解析为 Map<String, DailyInstanceType>
        Map<String, DailyInstanceTypeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDailyInstanceTypeConfigMap(tempMap);
    }

    public void autoLoadCharacterSkillUpgradeConfig() {
        File dataFile = DataUtils.getDataFile(CharacterSkillUpgradeDataName);

        // 解析为 Map<String, CharacterSkillUpgrade>
        Map<String, CharacterSkillUpgradeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterSkillUpgradeConfigMap(tempMap);
    }

    public void autoLoadMiningTreasureConfig() {
        File dataFile = DataUtils.getDataFile(MiningTreasureDataName);

        // 解析为 Map<String, MiningTreasure>
        Map<String, MiningTreasureConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMiningTreasureConfigMap(tempMap);
    }

    public void autoLoadConfigConfig() {
        File dataFile = DataUtils.getDataFile(ConfigDataName);

        // 解析为 Map<String, Config>
        Map<String, ConfigConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setConfigConfigMap(tempMap);
    }

    public void autoLoadTutorialLevelFloorConfig() {
        File dataFile = DataUtils.getDataFile(TutorialLevelFloorDataName);

        // 解析为 Map<String, TutorialLevelFloor>
        Map<String, TutorialLevelFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTutorialLevelFloorConfigMap(tempMap);
    }

    public void autoLoadCharacterSkinThemeConfig() {
        File dataFile = DataUtils.getDataFile(CharacterSkinThemeDataName);

        // 解析为 Map<String, CharacterSkinTheme>
        Map<String, CharacterSkinThemeConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterSkinThemeConfigMap(tempMap);
    }

    public void autoLoadDictionaryTopBarEntryConfig() {
        File dataFile = DataUtils.getDataFile(DictionaryTopBarEntryDataName);

        // 解析为 Map<String, DictionaryTopBarEntry>
        Map<String, DictionaryTopBarEntryConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDictionaryTopBarEntryConfigMap(tempMap);
    }

    public void autoLoadFateCardConfig() {
        File dataFile = DataUtils.getDataFile(FateCardDataName);

        // 解析为 Map<String, FateCard>
        Map<String, FateCardConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setFateCardConfigMap(tempMap);
    }

    public void autoLoadGmTeamConfig() {
        File dataFile = DataUtils.getDataFile(GmTeamDataName);

        // 解析为 Map<String, GmTeam>
        Map<String, GmTeamConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setGmTeamConfigMap(tempMap);
    }

    public void autoLoadTowerDefenseMonsterConfig() {
        File dataFile = DataUtils.getDataFile(TowerDefenseMonsterDataName);

        // 解析为 Map<String, TowerDefenseMonster>
        Map<String, TowerDefenseMonsterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTowerDefenseMonsterConfigMap(tempMap);
    }

    public void autoLoadVampireTalentFloorConfig() {
        File dataFile = DataUtils.getDataFile(VampireTalentFloorDataName);

        // 解析为 Map<String, VampireTalentFloor>
        Map<String, VampireTalentFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireTalentFloorConfigMap(tempMap);
    }

    public void autoLoadDemonAdvanceConfig() {
        File dataFile = DataUtils.getDataFile(DemonAdvanceDataName);

        // 解析为 Map<String, DemonAdvance>
        Map<String, DemonAdvanceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDemonAdvanceConfigMap(tempMap);
    }

    public void autoLoadWeeklyQuestConfig() {
        File dataFile = DataUtils.getDataFile(WeeklyQuestDataName);

        // 解析为 Map<String, WeeklyQuest>
        Map<String, WeeklyQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setWeeklyQuestConfigMap(tempMap);
    }

    public void autoLoadAcquireRewardConfig() {
        File dataFile = DataUtils.getDataFile(AcquireRewardDataName);

        // 解析为 Map<String, AcquireReward>
        Map<String, AcquireRewardConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAcquireRewardConfigMap(tempMap);
    }

    public void autoLoadVampireTalentDescConfig() {
        File dataFile = DataUtils.getDataFile(VampireTalentDescDataName);

        // 解析为 Map<String, VampireTalentDesc>
        Map<String, VampireTalentDescConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setVampireTalentDescConfigMap(tempMap);
    }

    public void autoLoadDailyQuestActiveConfig() {
        File dataFile = DataUtils.getDataFile(DailyQuestActiveDataName);

        // 解析为 Map<String, DailyQuestActive>
        Map<String, DailyQuestActiveConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDailyQuestActiveConfigMap(tempMap);
    }

    public void autoLoadStarTowerFloorConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerFloorDataName);

        // 解析为 Map<String, StarTowerFloor>
        Map<String, StarTowerFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerFloorConfigMap(tempMap);
    }

    public void autoLoadStarTowerBuildConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerBuildDataName);

        // 解析为 Map<String, StarTowerBuild>
        Map<String, StarTowerBuildConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerBuildConfigMap(tempMap);
    }

    public void autoLoadStarTowerBookFateCardConfig() {
        File dataFile = DataUtils.getDataFile(StarTowerBookFateCardDataName);

        // 解析为 Map<String, StarTowerBookFateCard>
        Map<String, StarTowerBookFateCardConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStarTowerBookFateCardConfigMap(tempMap);
    }

    public void autoLoadBoardNpcConfig() {
        File dataFile = DataUtils.getDataFile(BoardNpcDataName);

        // 解析为 Map<String, BoardNpc>
        Map<String, BoardNpcConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setBoardNpcConfigMap(tempMap);
    }

    public void autoLoadTalentConfig() {
        File dataFile = DataUtils.getDataFile(TalentDataName);

        // 解析为 Map<String, Talent>
        Map<String, TalentConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setTalentConfigMap(tempMap);
    }

    public void autoLoadCharacterCgConfig() {
        File dataFile = DataUtils.getDataFile(CharacterCgDataName);

        // 解析为 Map<String, CharacterCg>
        Map<String, CharacterCgConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterCgConfigMap(tempMap);
    }

    public void autoLoadHonorCharacterConfig() {
        File dataFile = DataUtils.getDataFile(HonorCharacterDataName);

        // 解析为 Map<String, HonorCharacter>
        Map<String, HonorCharacterConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setHonorCharacterConfigMap(tempMap);
    }

    public void autoLoadActivityGoodsConfig() {
        File dataFile = DataUtils.getDataFile(ActivityGoodsDataName);

        // 解析为 Map<String, ActivityGoods>
        Map<String, ActivityGoodsConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityGoodsConfigMap(tempMap);
    }

    public void autoLoadMonsterValueTempleteModifyConfig() {
        File dataFile = DataUtils.getDataFile(MonsterValueTempleteModifyDataName);

        // 解析为 Map<String, MonsterValueTempleteModify>
        Map<String, MonsterValueTempleteModifyConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setMonsterValueTempleteModifyConfigMap(tempMap);
    }

    public void autoLoadOpenFuncConfig() {
        File dataFile = DataUtils.getDataFile(OpenFuncDataName);

        // 解析为 Map<String, OpenFunc>
        Map<String, OpenFuncConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setOpenFuncConfigMap(tempMap);
    }

    public void autoLoadJointDrillControlConfig() {
        File dataFile = DataUtils.getDataFile(JointDrillControlDataName);

        // 解析为 Map<String, JointDrillControl>
        Map<String, JointDrillControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setJointDrillControlConfigMap(tempMap);
    }

    public void autoLoadAddBuffActionConfig() {
        File dataFile = DataUtils.getDataFile(AddBuffActionDataName);

        // 解析为 Map<String, AddBuffAction>
        Map<String, AddBuffActionConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAddBuffActionConfigMap(tempMap);
    }

    public void autoLoadRegionBossFloorConfig() {
        File dataFile = DataUtils.getDataFile(RegionBossFloorDataName);

        // 解析为 Map<String, RegionBossFloor>
        Map<String, RegionBossFloorConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setRegionBossFloorConfigMap(tempMap);
    }

    public void autoLoadShieldValueConfig() {
        File dataFile = DataUtils.getDataFile(ShieldValueDataName);

        // 解析为 Map<String, ShieldValue>
        Map<String, ShieldValueConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setShieldValueConfigMap(tempMap);
    }

    public void autoLoadStoryRolePersonalityConfig() {
        File dataFile = DataUtils.getDataFile(StoryRolePersonalityDataName);

        // 解析为 Map<String, StoryRolePersonality>
        Map<String, StoryRolePersonalityConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setStoryRolePersonalityConfigMap(tempMap);
    }

    public void autoLoadActivityAvgLevelConfig() {
        File dataFile = DataUtils.getDataFile(ActivityAvgLevelDataName);

        // 解析为 Map<String, ActivityAvgLevel>
        Map<String, ActivityAvgLevelConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityAvgLevelConfigMap(tempMap);
    }

    public void autoLoadActivityTaskControlConfig() {
        File dataFile = DataUtils.getDataFile(ActivityTaskControlDataName);

        // 解析为 Map<String, ActivityTaskControl>
        Map<String, ActivityTaskControlConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setActivityTaskControlConfigMap(tempMap);
    }

    public void autoLoadAffinityQuestConfig() {
        File dataFile = DataUtils.getDataFile(AffinityQuestDataName);

        // 解析为 Map<String, AffinityQuest>
        Map<String, AffinityQuestConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setAffinityQuestConfigMap(tempMap);
    }

    public void autoLoadDatingCharTagConfig() {
        File dataFile = DataUtils.getDataFile(DatingCharTagDataName);

        // 解析为 Map<String, DatingCharTag>
        Map<String, DatingCharTagConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setDatingCharTagConfigMap(tempMap);
    }

    public void autoLoadCharacterAdvanceConfig() {
        File dataFile = DataUtils.getDataFile(CharacterAdvanceDataName);

        // 解析为 Map<String, CharacterAdvance>
        Map<String, CharacterAdvanceConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setCharacterAdvanceConfigMap(tempMap);
    }

    public void autoLoadScoreBossRewardConfig() {
        File dataFile = DataUtils.getDataFile(ScoreBossRewardDataName);

        // 解析为 Map<String, ScoreBossReward>
        Map<String, ScoreBossRewardConfig> tempMap = objectMapper.readValue(
                dataFile,
                new TypeReference<>() {
                }
        );

        gameDataMgr.setScoreBossRewardConfigMap(tempMap);
    }
    @PostConstruct
    public void autoLoadAllConfig() {
        autoLoadTowerDefenseGuideConfig();
        autoLoadShieldConfig();
        autoLoadDropItemShowConfig();
        autoLoadActivityConfig();
        autoLoadTowerDefenseCharacterConfig();
        autoLoadAttributeSetLimitConfig();
        autoLoadHandbookConfig();
        autoLoadStarTowerFloorExpConfig();
        autoLoadStoryPersonalityConfig();
        autoLoadFormationSceneConfig();
        autoLoadDatingLandmarkConfig();
        autoLoadTravelerDuelChallengeDifficultyConfig();
        autoLoadCharacterTagConfig();
        autoLoadFactionRelationConfig();
        autoLoadAssistQuestGroupConfig();
        autoLoadMonsterValueTempleteConfig();
        autoLoadActivityGroupConfig();
        autoLoadCharacterSkinPanelFaceConfig();
        autoLoadBreakOutFloorConfig();
        autoLoadDatingCharResponseConfig();
        autoLoadMainlineFloorConfig();
        autoLoadStoryConfig();
        autoLoadVampireEnemyPoolConfig();
        autoLoadBdConvertContentConfig();
        autoLoadTravelerDuelChallengeQuestConfig();
        autoLoadActivityShopConfig();
        autoLoadAffinityLevelConfig();
        autoLoadScoreBossFloorConfig();
        autoLoadScoreGetSwitchConfig();
        autoLoadStarTowerBookFateCardBundleConfig();
        autoLoadCharGemInstanceTypeConfig();
        autoLoadGachaNewbieConfig();
        autoLoadDiscPromoteConfig();
        autoLoadBattlePassConfig();
        autoLoadBattleThresholdConfig();
        autoLoadMonthlyCardConfig();
        autoLoadBdConvertRewardGroupConfig();
        autoLoadScoreBossGetControlConfig();
        autoLoadActivityStoryConfig();
        autoLoadMainSkillConfig();
        autoLoadPopUpConfig();
        autoLoadProduceHelperConfig();
        autoLoadStarTowerTalkConfig();
        autoLoadEffectConfig();
        autoLoadStarTowerBookPotentialRewardConfig();
        autoLoadCookieControlConfig();
        autoLoadDropPkgConfig();
        autoLoadStoryChapterTimeStampConfig();
        autoLoadAgentSpecialPerformanceConfig();
        autoLoadHitDamageConfig();
        autoLoadTalentGroupConfig();
        autoLoadAttributeConfig();
        autoLoadInfinityTowerBountyLevelConfig();
        autoLoadJointDrillRankConfig();
        autoLoadAiConfig();
        autoLoadOnceAdditionalAttributeConfig();
        autoLoadTourGuideQuestConfig();
        autoLoadStarTowerGroupConfig();
        autoLoadStarTowerSpModeConfig();
        autoLoadTrialBuildConfig();
        autoLoadMiningControlConfig();
        autoLoadScoreBossStarConfig();
        autoLoadTowerDefenseControlConfig();
        autoLoadMailTemplateConfig();
        autoLoadTravelerDuelChallengeAffixConfig();
        autoLoadTowerDefenseItemConfig();
        autoLoadTrialPotentialConfig();
        autoLoadAssistAttributeConfig();
        autoLoadSubNoteSkillDropGroupConfig();
        autoLoadHonorConfig();
        autoLoadStarTowerEventConfig();
        autoLoadBdConvertConditionConfig();
        autoLoadStarTowerScenePrefabConfig();
        autoLoadWeekBossFloorConfig();
        autoLoadGuideGroupConfig();
        autoLoadRegionBossAffixConfig();
        autoLoadNpcConfigConfig();
        autoLoadMiningSupportConfig();
        autoLoadRankConfig();
        autoLoadTourGuideQuestGroupConfig();
        autoLoadBuffConfig();
        autoLoadCharGemInstanceConfig();
        autoLoadGachaATypeProbConfig();
        autoLoadScoreBossRankConfig();
        autoLoadEventResultConfig();
        autoLoadStarTowerMonsterSpAttrConfig();
        autoLoadTravelerDuelBossConfig();
        autoLoadSignInConfig();
        autoLoadCharacterArchiveVoiceConfig();
        autoLoadDropObjectGroupConfig();
        autoLoadMonsterTeamConfig();
        autoLoadDailyInstanceConfig();
        autoLoadStarTowerQuestConfig();
        autoLoadStorySetChapterConfig();
        autoLoadRegionBossConfig();
        autoLoadStoryChapterConfig();
        autoLoadNpcAffinityPlotConfig();
        autoLoadCharItemExpConfig();
        autoLoadSecondarySkillConfig();
        autoLoadGachaPkgConfig();
        autoLoadMiningDemoConfigConfig();
        autoLoadWeekBossAffixConfig();
        autoLoadMallGemConfig();
        autoLoadProductionTypeConfig();
        autoLoadTestCharacterListConfig();
        autoLoadDropObjectConfig();
        autoLoadDictionaryEntryConfig();
        autoLoadAffinityUpRewardConfig();
        autoLoadStarTowerEnemySetConfig();
        autoLoadTrialControlConfig();
        autoLoadVampireSurvivorQuestConfig();
        autoLoadScriptParameterConfig();
        autoLoadTestTeamDataConfig();
        autoLoadAchievementConfig();
        autoLoadScriptParameterValueConfig();
        autoLoadCookiePackagePathsGroupConfig();
        autoLoadJointDrillLevelConfig();
        autoLoadCharacterUpgradeConfig();
        autoLoadHtmlConfigConfig();
        autoLoadCharGemAttrValueConfig();
        autoLoadTowerDefenceCharacterAiConfig();
        autoLoadInfinityTowerMapConfig();
        autoLoadDatingCharacterEventConfig();
        autoLoadActivityStoryConditionConfig();
        autoLoadActivityLevelsFloorConfig();
        autoLoadStarTowerNpcConfig();
        autoLoadCookieFloorConfig();
        autoLoadVampireSurvivorLevelConfig();
        autoLoadGmSupermanConfig();
        autoLoadTrialGroupConfig();
        autoLoadWeekBossLevelConfig();
        autoLoadGmBuildConfig();
        autoLoadCharGemConfig();
        autoLoadResidentGoodsConfig();
        autoLoadCharAffinityTemplateConfig();
        autoLoadTowerDefenseQuestConfig();
        autoLoadMangaLoadingConfig();
        autoLoadCookieLevelConfig();
        autoLoadGuideConfig();
        autoLoadForceConfig();
        autoLoadStarTowerFloorSetConfig();
        autoLoadTutorialLevelConfig();
        autoLoadActivityStoryEvidenceConfig();
        autoLoadCharacterSkinConfig();
        autoLoadDestroyObjectSprConfig();
        autoLoadEnergyBuyConfig();
        autoLoadTowerDefenseLevelConfig();
        autoLoadPreviewMonsterGroupConfig();
        autoLoadMallShopPageConfig();
        autoLoadDatingStartEndEventConfig();
        autoLoadActivityStoryChapterConfig();
        autoLoadDictionaryDiagramConfig();
        autoLoadSkillInstanceFloorConfig();
        autoLoadBuffEffectConfig();
        autoLoadAttributeLimitConfig();
        autoLoadDailyInstanceFloorConfig();
        autoLoadPeriodicQuestGroupConfig();
        autoLoadCookieRhythmlResultConfig();
        autoLoadCharacterArchiveConfig();
        autoLoadNpcAffinityGroupConfig();
        autoLoadInfinityTowerFloorConfig();
        autoLoadActivityShopControlConfig();
        autoLoadAdControlConfig();
        autoLoadInfinityTowerLevelConfig();
        autoLoadDiscExtraAttributeConfig();
        autoLoadGachaStorageConfig();
        autoLoadLoginRewardGroupConfig();
        autoLoadAffinityGiftConfig();
        autoLoadWeeklyQuestActiveConfig();
        autoLoadTowerDefensePotentialConfig();
        autoLoadActivityTaskGroupConfig();
        autoLoadLoginRewardControlConfig();
        autoLoadTitleConfig();
        autoLoadAssistQuestConfig();
        autoLoadDailyQuestAwardConfig();
        autoLoadTravelerDuelChallengeControlConfig();
        autoLoadJointDrillQuestConfig();
        autoLoadMallPackageConfig();
        autoLoadEffectDescConfig();
        autoLoadJointDrillAffixConfig();
        autoLoadGachaTypeConfig();
        autoLoadSkillConfig();
        autoLoadMallPackagePageConfig();
        autoLoadSkillInstanceTypeConfig();
        autoLoadInfinityTowerConfig();
        autoLoadSubNoteSkillPromoteGroupConfig();
        autoLoadDictionaryTabConfig();
        autoLoadCharacterVoiceControlConfig();
        autoLoadTowerDefenseTeamExpConfig();
        autoLoadUiTextConfig();
        autoLoadErrorCodeConfig();
        autoLoadInfinityTowerDifficultyConfig();
        autoLoadStorySetSectionConfig();
        autoLoadBuffValueConfig();
        autoLoadCharacterArchiveContentConfig();
        autoLoadChestConfig();
        autoLoadNpcSkinConfig();
        autoLoadWordConfig();
        autoLoadFloorBuffConfig();
        autoLoadMainScreenCgConfig();
        autoLoadMallMonthlyCardConfig();
        autoLoadPeriodicQuestControlConfig();
        autoLoadRegionBossLevelConfig();
        autoLoadLevelQuestTargetConfig();
        autoLoadPotentialConfig();
        autoLoadCharRaritySequenceConfig();
        autoLoadCharGemSlotControlConfig();
        autoLoadVampireRankSeasonConfig();
        autoLoadBreakOutEnemySprConfig();
        autoLoadGamepadActionConfig();
        autoLoadItemConfig();
        autoLoadMallShopConfig();
        autoLoadStarTowerBookFateCardQuestConfig();
        autoLoadSubNoteSkillConfig();
        autoLoadStarTowerShopGoodsConfig();
        autoLoadAgentTabConfig();
        autoLoadMonsterSkinConfig();
        autoLoadDiscPromoteLimitConfig();
        autoLoadTowerDefenseFloorConfig();
        autoLoadAgentConfig();
        autoLoadItemPackMarkConfig();
        autoLoadMonsterManualConfig();
        autoLoadStarTowerGrowthGroupConfig();
        autoLoadAreaEffectConfig();
        autoLoadPlotConfig();
        autoLoadInteractiveActionConfig();
        autoLoadPopUpSequenceConfig();
        autoLoadDatingBranchConfig();
        autoLoadMonsterValueTempleteAdjustConfig();
        autoLoadVoDirectoryConfig();
        autoLoadDropConfig();
        autoLoadStoryConditionConfig();
        autoLoadVampireSurvivorConfig();
        autoLoadEnumDescConfig();
        autoLoadTrialFloorConfig();
        autoLoadStarTowerComboConfig();
        autoLoadEndSceneTypeConfig();
        autoLoadScoreBossAbilityConfig();
        autoLoadStarTowerMapConfig();
        autoLoadCharGemInstanceFloorConfig();
        autoLoadPlayerHeadConfig();
        autoLoadTopBarConfig();
        autoLoadContentWordConfig();
        autoLoadVampireEnemySetConfig();
        autoLoadScoreBossControlConfig();
        autoLoadMiningStoryConfig();
        autoLoadCharGradeConfig();
        autoLoadInfinityTowerAffixConfig();
        autoLoadPeriodicQuestConfig();
        autoLoadActivityLevelsLevelConfig();
        autoLoadBattlePassLevelConfig();
        autoLoadTowerDefenseQuestGroupConfig();
        autoLoadDiscStrengthenConfig();
        autoLoadMonsterConfig();
        autoLoadChatConfig();
        autoLoadVampireMapConfig();
        autoLoadJointDrillFloorConfig();
        autoLoadStarTowerMonsterBornGroupConfig();
        autoLoadBannerConfig();
        autoLoadStarTowerConfig();
        autoLoadChapterConfig();
        autoLoadInfinityTowerMsgConfig();
        autoLoadBattlePassRewardConfig();
        autoLoadCharacterArchiveBaseInfoConfig();
        autoLoadTrapConfig();
        autoLoadTrialDiscConfig();
        autoLoadVampireFloorConfig();
        autoLoadDatingLandmarkEventConfig();
        autoLoadDiscTagConfig();
        autoLoadScoreBossBattleThresholdConfig();
        autoLoadGachaConfig();
        autoLoadMonsterAttributeContactConfig();
        autoLoadMonsterAiConfig();
        autoLoadStarTowerCombatEventConfig();
        autoLoadVampireEnemySpAttrConfig();
        autoLoadStarTowerGrowthNodeConfig();
        autoLoadDailyQuestConfig();
        autoLoadBdConvertConfig();
        autoLoadBdConvertControlConfig();
        autoLoadScoreBossLevelConfig();
        autoLoadMonsterActionBranchConfig();
        autoLoadGmOrderConfig();
        autoLoadStarTowerStageConfig();
        autoLoadDestroyObjectConfig();
        autoLoadJumpToConfig();
        autoLoadStarTowerBuildRankConfig();
        autoLoadCharacterDesConfig();
        autoLoadStarTowerEventOptionActionConfig();
        autoLoadStarTowerMapMaxNumPerStageConfig();
        autoLoadCharPotentialConfig();
        autoLoadBreakOutCharacterConfig();
        autoLoadCharGetLinesConfig();
        autoLoadEventOptionsRulesConfig();
        autoLoadInfinityTowerEnemySetConfig();
        autoLoadStoryEvidenceConfig();
        autoLoadStarTowerBookEventRewardConfig();
        autoLoadDailyInstanceRewardGroupConfig();
        autoLoadDiscConfig();
        autoLoadProductionConfig();
        autoLoadVampireTalentConfig();
        autoLoadWeightParameterConfig();
        autoLoadDiscItemExpConfig();
        autoLoadStarTowerEventActionConfig();
        autoLoadTrialCharacterConfig();
        autoLoadStarTowerDropItemConfig();
        autoLoadBattlePassQuestConfig();
        autoLoadCharacterConfig();
        autoLoadJointDrillBattleThresholdConfig();
        autoLoadStarTowerBookEntranceConfig();
        autoLoadEffectValueConfig();
        autoLoadWorldClassConfig();
        autoLoadTravelerDuelFloorConfig();
        autoLoadGamepadButtonConfig();
        autoLoadOnceAdditionalAttributeValueConfig();
        autoLoadStarTowerTeamExpConfig();
        autoLoadTravelerDuelBossLevelConfig();
        autoLoadEventOptionsConfig();
        autoLoadSkillInstanceConfig();
        autoLoadWeekBossTypeConfig();
        autoLoadActivityTaskConfig();
        autoLoadTestCharacterAttConfig();
        autoLoadDiscIpConfig();
        autoLoadLevelQuestConfig();
        autoLoadResidentShopConfig();
        autoLoadDailyInstanceTypeConfig();
        autoLoadCharacterSkillUpgradeConfig();
        autoLoadMiningTreasureConfig();
        autoLoadConfigConfig();
        autoLoadTutorialLevelFloorConfig();
        autoLoadCharacterSkinThemeConfig();
        autoLoadDictionaryTopBarEntryConfig();
        autoLoadFateCardConfig();
        autoLoadGmTeamConfig();
        autoLoadTowerDefenseMonsterConfig();
        autoLoadVampireTalentFloorConfig();
        autoLoadDemonAdvanceConfig();
        autoLoadWeeklyQuestConfig();
        autoLoadAcquireRewardConfig();
        autoLoadVampireTalentDescConfig();
        autoLoadDailyQuestActiveConfig();
        autoLoadStarTowerFloorConfig();
        autoLoadStarTowerBuildConfig();
        autoLoadStarTowerBookFateCardConfig();
        autoLoadBoardNpcConfig();
        autoLoadTalentConfig();
        autoLoadCharacterCgConfig();
        autoLoadHonorCharacterConfig();
        autoLoadActivityGoodsConfig();
        autoLoadMonsterValueTempleteModifyConfig();
        autoLoadOpenFuncConfig();
        autoLoadJointDrillControlConfig();
        autoLoadAddBuffActionConfig();
        autoLoadRegionBossFloorConfig();
        autoLoadShieldValueConfig();
        autoLoadStoryRolePersonalityConfig();
        autoLoadActivityAvgLevelConfig();
        autoLoadActivityTaskControlConfig();
        autoLoadAffinityQuestConfig();
        autoLoadDatingCharTagConfig();
        autoLoadCharacterAdvanceConfig();
        autoLoadScoreBossRewardConfig();
    }}