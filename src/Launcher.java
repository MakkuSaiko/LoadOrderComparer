import za.modTools.Data;

import java.util.Scanner;

public class Launcher
{
    public static void main(String[] args)
    {
        Data data = new Data();
        data.setList1("  0  0     Skyrim.esm\n" +
                "  1  1     Update.esm\n" +
                "  2  2     Dawnguard.esm\n" +
                "  3  3     HearthFires.esm\n" +
                "  4  4     Dragonborn.esm\n" +
                "254 FE   1 ccbgssse003-zombies.esl\n" +
                "254 FE   2 ccbgssse004-ruinsedge.esl\n" +
                "254 FE   3 ccbgssse006-stendarshammer.esl\n" +
                "254 FE   4 ccbgssse007-chrysamere.esl\n" +
                "254 FE   5 ccbgssse010-petdwarvenarmoredmudcrab.esl\n" +
                "254 FE   6 ccbgssse014-spellpack01.esl\n" +
                "254 FE   7 ccbgssse019-staffofsheogorath.esl\n" +
                "254 FE   8 ccbgssse020-graycowl.esl\n" +
                "254 FE   9 ccbgssse021-lordsmail.esl\n" +
                "254 FE   a ccmtysse001-knightsofthenine.esl\n" +
                "254 FE   b ccqdrsse001-survivalmode.esl\n" +
                "  5  5     cctwbsse001-puzzledungeon.esm\n" +
                "  6  6     cceejsse001-hstead.esm\n" +
                "254 FE   c ccqdrsse002-firewood.esl\n" +
                "254 FE   d ccbgssse018-shadowrend.esl\n" +
                "254 FE   e ccbgssse035-petnhound.esl\n" +
                "254 FE   f ccfsvsse001-backpacks.esl\n" +
                "254 FE  10 cceejsse002-tower.esl\n" +
                "254 FE  11 ccedhsse001-norjewel.esl\n" +
                "254 FE  12 ccvsvsse002-pets.esl\n" +
                "254 FE  13 ccbgssse037-curios.esl\n" +
                "254 FE  14 ccbgssse034-mntuni.esl\n" +
                "254 FE  15 ccbgssse045-hasedoki.esl\n" +
                "254 FE  16 ccbgssse008-wraithguard.esl\n" +
                "254 FE  17 ccbgssse036-petbwolf.esl\n" +
                "254 FE  18 ccffbsse001-imperialdragon.esl\n" +
                "254 FE  19 ccmtysse002-ve.esl\n" +
                "254 FE  1a ccbgssse043-crosselv.esl\n" +
                "254 FE  1b ccvsvsse001-winter.esl\n" +
                "  7  7     ccbgssse016-umbra.esm\n" +
                "  8  8     ccbgssse031-advcyrus.esm\n" +
                "254 FE  1d ccbgssse040-advobgobs.esl\n" +
                "254 FE  1e ccbgssse058-ba_steel.esl\n" +
                "254 FE  1f ccpewsse002-armsofchaos.esl\n" +
                "254 FE  20 ccbgssse041-netchleather.esl\n" +
                "254 FE  21 ccedhsse002-splkntset.esl\n" +
                "254 FE  22 ccbgssse064-ba_elven.esl\n" +
                "254 FE  23 ccbgssse063-ba_ebony.esl\n" +
                "254 FE  24 ccbgssse062-ba_dwarvenmail.esl\n" +
                "254 FE  25 ccbgssse060-ba_dragonscale.esl\n" +
                "254 FE  26 ccbgssse051-ba_daedricmail.esl\n" +
                "254 FE  27 ccbgssse057-ba_stalhrim.esl\n" +
                "  9  9     ccbgssse025-advdsgs.esm\n" +
                "254 FE  28 ccffbsse002-crossbowpack.esl\n" +
                "254 FE  29 ccbgssse013-dawnfang.esl\n" +
                "254 FE  2a cceejsse004-hall.esl\n" +
                " 10  a     Unofficial Skyrim Special Edition Patch.esp\n" +
                " 11  b     RealisticWaterTwo - Resources.esm\n" +
                " 12  c     Coldhaven.esm\n" +
                "254 FE  2b TrueHUD.esl\n" +
                " 13  d     RFM.esm\n" +
                " 14  e     SkyUI_SE.esp\n" +
                " 15  f     Beards.esp\n" +
                " 16 10     Chesko_WearableLantern.esp\n" +
                " 17 11     CBBE.esp\n" +
                "254 FE  2c HPP - Vaermina's Torpor.esp\n" +
                " 18 12     Celtic_Music_In_Skyrim_SE.esp\n" +
                " 19 13     SmoothCam.esp\n" +
                "254 FE  2d TrueDirectionalMovement.esp\n" +
                " 20 14     UltimateCombat.esp\n" +
                " 21 15     DSerCombatGameplayOverhaul.esp\n" +
                "254 FE  2e Souls_Quick_Menu.esp\n" +
                " 22 16     RaceMenu.esp\n" +
                " 23 17     RaceMenuPlugin.esp\n" +
                " 24 18     EnhancedLightsandFX.esp\n" +
                " 25 19     ELFX - Exteriors.esp\n" +
                "254 FE  2f ELFX Fixes.esp\n" +
                " 26 1a     Moonlight Tales Special Edition.esp\n" +
                " 27 1b     Eli_Skaal Village Overhaul.esp\n" +
                " 28 1c     Beasts of Tamriel.esp\n" +
                " 29 1d     OBIS SE.esp\n" +
                " 30 1e     Undriel_QuaintRavenRock.esp\n" +
                " 31 1f     SeranaDialogAddon.esp\n" +
                " 32 20     ELFX - Weathers.esp\n" +
                " 33 21     Hothtrooper44_ArmorCompilation.esp\n" +
                " 34 22     Summermyst - Enchantments of Skyrim.esp\n" +
                "254 FE  30 aMidianBorn Armor Variants Lite.esp\n" +
                " 35 23     Hothtrooper44_Armor_Ecksstra.esp\n" +
                " 36 24     Guards_Armor_Replacer.esp\n" +
                " 37 25     VisualAnimatedEnchants.esp\n" +
                " 38 26     dD - Enhanced Blood Main.esp\n" +
                " 39 27     dD-Larger Drips.esp\n" +
                " 40 28     dD-Larger Splatter Size.esp\n" +
                " 41 29     Dynamic Camera.esp\n" +
                " 42 2a     DCR_KingCrusaderMegaPack_SSE.esp\n" +
                " 43 2b     Dr_Bandolier.esp\n" +
                " 44 2c     Serana.esp\n" +
                "254 FE  31 CK_Selina_Follower.esp\n" +
                "254 FE  32 Silver Bowblade.esp\n" +
                " 45 2d     Mythical Ages.esp\n" +
                " 46 2e     Better Vampire NPCs.esp\n" +
                " 47 2f     Tel Mithryn.esp\n" +
                " 48 30     SofiaFollower.esp\n" +
                " 49 31     Hell Sword.esp\n" +
                " 50 32     armored-horses.esp\n" +
                " 51 33     KrittaKittyHorsesForSSE.esp\n" +
                " 52 34     Skaal You Need.esp\n" +
                " 53 35     Hermit.esp\n" +
                " 54 36     Contractor Armor.esp\n" +
                " 55 37     AMatterOfTime.esp\n" +
                " 56 38     Imperious - Races of Skyrim.esp\n" +
                " 57 39     Ordinator - Perks of Skyrim.esp\n" +
                " 58 3a     Apocalypse - Magic of Skyrim.esp\n" +
                " 59 3b     Apocalypse - Ordinator Compatibility Patch.esp\n" +
                " 60 3c     Better Vampires.esp\n" +
                " 61 3d     Immersive Citizens - AI Overhaul.esp\n" +
                " 62 3e     ELFXEnhancer.esp\n" +
                " 63 3f     Immersive Citizens - ELFXEnhancer patch.esp\n" +
                "254 FE  33 ELFX Fixes Ragged Flagon Fix.esp\n"+
                "254 FE  34 AQWMP_AMM_Patch.esp\n" +
                "254 FE  35 AQWMP_RWT_Patch.esp\n");

        data.setList2("  0  0     Skyrim.esm\n" +
                "  1  1     Update.esm\n" +
                "  2  2     Dawnguard.esm\n" +
                "  3  3     HearthFires.esm\n" +
                "  4  4     Dragonborn.esm\n" +
                "254 FE   0 ccbgssse002-exoticarrows.esl\n" +
                "254 FE   1 ccbgssse003-zombies.esl\n" +
                "254 FE   2 ccbgssse004-ruinsedge.esl\n" +
                "254 FE   3 ccbgssse006-stendarshammer.esl\n" +
                "254 FE   4 ccbgssse007-chrysamere.esl\n" +
                "254 FE   5 ccbgssse010-petdwarvenarmoredmudcrab.esl\n" +
                "254 FE   6 ccbgssse014-spellpack01.esl\n" +
                "254 FE   7 ccbgssse019-staffofsheogorath.esl\n" +
                "254 FE   8 ccbgssse020-graycowl.esl\n" +
                "254 FE   9 ccbgssse021-lordsmail.esl\n" +
                "254 FE   b ccqdrsse001-survivalmode.esl\n" +
                "  6  6     cceejsse001-hstead.esm\n" +
                "254 FE   d ccbgssse018-shadowrend.esl\n" +
                "254 FE   e ccbgssse035-petnhound.esl\n" +
                "254 FE   f ccfsvsse001-backpacks.esl\n" +
                "254 FE  11 ccedhsse001-norjewel.esl\n" +
                "254 FE  12 ccvsvsse002-pets.esl\n" +
                "254 FE  13 ccbgssse037-curios.esl\n" +
                "254 FE  14 ccbgssse034-mntuni.esl\n" +
                "254 FE  15 ccbgssse045-hasedoki.esl\n" +
                "254 FE  16 ccbgssse008-wraithguard.esl\n" +
                "254 FE  17 ccbgssse036-petbwolf.esl\n" +
                "254 FE  18 ccffbsse001-imperialdragon.esl\n" +
                "254 FE  19 ccmtysse002-ve.esl\n" +
                "254 FE  1a ccbgssse043-crosselv.esl\n" +
                "254 FE  1b ccvsvsse001-winter.esl\n" +
                "254 FE  1c cceejsse003-hollow.esl\n" +
                "  7  7     ccbgssse016-umbra.esm\n" +
                "  8  8     ccbgssse031-advcyrus.esm\n" +
                "254 FE  1e ccbgssse058-ba_steel.esl\n" +
                "254 FE  1f ccpewsse002-armsofchaos.esl\n" +
                "254 FE  20 ccbgssse041-netchleather.esl\n" +
                "254 FE  21 ccedhsse002-splkntset.esl\n" +
                "254 FE  22 ccbgssse064-ba_elven.esl\n" +
                "254 FE  23 ccbgssse063-ba_ebony.esl\n" +
                "254 FE  24 ccbgssse062-ba_dwarvenmail.esl\n" +
                "254 FE  25 ccbgssse060-ba_dragonscale.esl\n" +
                "254 FE  26 ccbgssse051-ba_daedricmail.esl\n" +
                "254 FE  27 ccbgssse057-ba_stalhrim.esl\n" +
                "  9  9     ccbgssse025-advdsgs.esm\n" +
                "254 FE  28 ccffbsse002-crossbowpack.esl\n" +
                "254 FE  29 ccbgssse013-dawnfang.esl\n" +
                " 11  b     RealisticWaterTwo - Resources.esm\n" +
                " 12  c     Coldhaven.esm\n" +
                "254 FE  2b TrueHUD.esl\n" +
                " 13  d     RFM.esm\n" +
                " 14  e     SkyUI_SE.esp\n" +
                " 15  f     Beards.esp\n" +
                " 16 10     Chesko_WearableLantern.esp\n" +
                " 17 11     CBBE.esp\n" +
                "254 FE  2c HPP - Vaermina's Torpor.esp\n" +
                " 18 12     Celtic_Music_In_Skyrim_SE.esp\n" +
                " 19 13     SmoothCam.esp\n" +
                "254 FE  2d TrueDirectionalMovement.esp\n" +
                " 20 14     UltimateCombat.esp\n" +
                " 21 15     DSerCombatGameplayOverhaul.esp\n" +
                "254 FE  2e Souls_Quick_Menu.esp\n" +
                " 22 16     RaceMenu.esp\n" +
                " 23 17     RaceMenuPlugin.esp\n" +
                " 24 18     EnhancedLightsandFX.esp\n" +
                " 25 19     ELFX - Exteriors.esp\n" +
                "254 FE  2f ELFX Fixes.esp\n" +
                " 26 1a     Moonlight Tales Special Edition.esp\n" +
                " 27 1b     Eli_Skaal Village Overhaul.esp\n" +
                " 28 1c     Beasts of Tamriel.esp\n" +
                " 29 1d     OBIS SE.esp\n" +
                " 30 1e     Undriel_QuaintRavenRock.esp\n" +
                " 31 1f     SeranaDialogAddon.esp\n" +
                " 32 20     ELFX - Weathers.esp\n" +
                " 33 21     Hothtrooper44_ArmorCompilation.esp\n" +
                " 34 22     Summermyst - Enchantments of Skyrim.esp\n" +
                "254 FE  30 aMidianBorn Armor Variants Lite.esp\n" +
                " 35 23     Hothtrooper44_Armor_Ecksstra.esp\n" +
                " 36 24     Guards_Armor_Replacer.esp\n" +
                " 37 25     VisualAnimatedEnchants.esp\n" +
                " 38 26     dD - Enhanced Blood Main.esp\n" +
                " 39 27     dD-Larger Drips.esp\n" +
                " 40 28     dD-Larger Splatter Size.esp\n" +
                " 41 29     Dynamic Camera.esp\n" +
                " 42 2a     DCR_KingCrusaderMegaPack_SSE.esp\n" +
                " 43 2b     Dr_Bandolier.esp\n" +
                " 44 2c     Serana.esp\n" +
                "254 FE  31 CK_Selina_Follower.esp\n" +
                "254 FE  32 Silver Bowblade.esp\n" +
                " 45 2d     Mythical Ages.esp\n" +
                " 46 2e     Better Vampire NPCs.esp\n" +
                " 47 2f     Tel Mithryn.esp\n" +
                " 48 30     SofiaFollower.esp\n" +
                " 49 31     Hell Sword.esp\n" +
                " 50 32     armored-horses.esp\n" +
                " 51 33     KrittaKittyHorsesForSSE.esp\n" +
                " 52 34     Skaal You Need.esp\n" +
                " 53 35     Hermit.esp\n" +
                " 54 36     Contractor Armor.esp\n" +
                " 55 37     AMatterOfTime.esp\n" +
                " 56 38     Imperious - Races of Skyrim.esp\n" +
                " 57 39     Ordinator - Perks of Skyrim.esp\n" +
                " 58 3a     Apocalypse - Magic of Skyrim.esp\n" +
                " 59 3b     Apocalypse - Ordinator Compatibility Patch.esp\n" +
                " 60 3c     Better Vampires.esp\n" +
                " 61 3d     Immersive Citizens - AI Overhaul.esp\n" +
                " 62 3e     ELFXEnhancer.esp\n" +
                " 63 3f     Immersive Citizens - ELFXEnhancer patch.esp\n" +
                " 64 40     RealisticWaterTwo.esp\n" +
                "254 FE  33 ELFX Fixes Ragged Flagon Fix.esp\n" +
                " 65 41     IcePenguinWorldMapPaper.esp\n" +
                "254 FE  34 AQWMP_AMM_Patch.esp\n");

        data.SortLists();
        System.out.println("Missing from B:\n"+data.showDifference(data.list1, data.list2));

        System.out.println("Missing from A:\n"+data.showDifference(data.list2, data.list1));

    }

}
