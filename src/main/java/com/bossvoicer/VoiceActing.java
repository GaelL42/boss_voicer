package com.bossvoicer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum VoiceActing {

    // Minimus & Sol Chatbox text
    WELCOME_GRAND_CHAMPION("Welcome, Grand Champion.", "sol/chatbox/welcome_grand_champion.wav"),
    WORTHY_CHALLENGER("By Ralos, we finally have a worthy challenger.", "sol/chatbox/worthy_challenger.wav"),
    ALMOST_IMPRESSED("You've torn through multiple waves of combatants and you're still standing. I'm almost impressed.", "sol/chatbox/almost_impressed.wav"),
    REAL_FOE("Now let's see how you handle a real foe...","sol/chatbox/real_foe.wav"),
    BACK_SO_SOON("You're back so soon? A lesser combatant would've retired in shame after the show you put on last time...", "sol/chatbox/back_so_soon.wav"),
    CLEARLY_DIFFERENT("But you're clearly different. Let's see what you have this time...","sol/chatbox/clearly_different.wav"),
    THIRD_TIME("What is it they say? Third time's the charm? Let's see if that's true.","sol/chatbox/third_time_the_charm.wav"),
    TO_ARMS("To arms!","sol/chatbox/to_arms.wav"),
    INCAPABLE_FIGHTER("You might be an incapable fighter, but at least you're persistent. Shall we?,","sol/chatbox/incapable_fighter.wav"),

    // Graardor Overhead Text
    SPLIT_THEIR_SKULLS("Split their skulls!","graardor/split_their_skulls.wav"),
    CRUSH_THEM_UNDERFOOT("Crush them underfoot!","graardor/crush_them_underfoot.wav"),
    FOR_GLORY_OF_WAR_GOD("For the glory of the Big High War God!","graardor/for_glory_of_war_god.wav"),
    BRARGH("Brargh!","graardor/brargh.wav"),
    ALL_GLORY_TO_BANDOS("All glory to Bandos!","graardor/all_glory_to_bandos.wav"),
    CHAAARGE("CHAAARGE!","graardor/chaaarge.wav"),
    FEAST_ON_BONES("We feast on the bones of our enemies tonight!","graardor/feast_on_bones.wav"),
    DEATH_TO_OUR_ENEMIES("Death to our enemies!","graardor/death_to_our_enemies.wav"),
    BREAK_THEIR_BONES("Break their bones!","graardor/break_their_bones.wav"),
    GRRRAAAAAR("GRRRAAAAAR!","graardor/grrraaaaar.wav"),
    GRAARDOR_DEATH("General Graardor Death","graardor/death.wav"),

    // K'ril Overhead text
    KILL_THEM_YOU_COWARDS("Kill them, you cowards!","kril/kill_them_you_cowards.wav"),
    ZAMORAK_CURSE_THEM("Zamorak curse them!","kril/zamorak_curse_them.wav"),
    DEATH_TO_SARADOMINS_DOGS("Death to Saradomin's dogs!","kril/death_to_saradomins_dogs.wav"),
    REND_THEM_LIMB_FROM_LIMB("Rend them limb from limb!","kril/rend_them_limb_from_limb.wav"),
    FLAY_THEM_ALL("Flay them all!","kril/flay_them_all.wav"),
    ATTACK_THEM_YOU_DOGS("Attack them, you dogs!","kril/attack_them_you_dogs.wav"),
    FORWARD("Forward!","kril/forward.wav"),
    ATTACK("Attack!","kril/attack.wav"),
    THE_DARK_ONE_WILL_HAVE_THEIR_SOULS("The Dark One will have their souls!","kril/the_dark_one_will_have_their_souls.wav"),
    NO_RETREAT("No retreat!","kril/no_retreat.wav"),
    YARRR("YARRRRRRR!","kril/yarrr.wav"),
    KRIL_DEATH("K'ril Tsutsaroth Death", "kril/death.wav"),

    // Vet'ion & Calvar'ion Overhead text
    I_WILL_SMITE_YOU("I will smite you!", "vetion/i_will_smite_you.wav"),
    I_WILL_SMITE_YOU_2("I WILL SMITE YOU!", "vetion/i_will_smite_you.wav"),
    I_GOT_YOU_NOW("I've got you now!", "vetion/i_got_you_now.wav"),
    I_GOT_YOU_NOW_2("I'VE GOT YOU NOW!", "vetion/i_got_you_now.wav"),
    STAND_STILL_RAT("Stand still, rat!", "vetion/stand_still_rat.wav"),
    STAND_STILL_RAT_2("STAND STILL, RAT!", "vetion/stand_still_rat.wav"),
    YOU_CANT_ESCAPE("You can't escape!", "vetion/you_cant_escape.wav"),
    YOU_CANT_ESCAPE_2("YOU CAN'T ESCAPE!", "vetion/you_cant_escape.wav"),
    FOR_THE_LORD("For the lord!", "vetion/for_the_lord.wav"),
    FOR_THE_LORD_2("FOR THE LORD!", "vetion/for_the_lord.wav"),
    YOU_CALL_THAT_A_WEAPON("You call that a weapon?!", "vetion/you_call_that_a_weapon.wav"),
    YOU_CALL_THAT_A_WEAPON_2("YOU CALL THAT A WEAPON?!", "vetion/you_call_that_a_weapon.wav"),
    NOW_I_GOT_YOU("Now I've got you!", "vetion/now_i_got_you.wav"),
    NOW_I_GOT_YOU_2("NOW I'VE GOT YOU!", "vetion/now_i_got_you.wav"),
    HANDS_OFF_WRETCH("Hands off, wretch!", "vetion/hands_off_wretch.wav"),
    HANDS_OFF_WRETCH_2("HANDS OFF, WRETCH!", "vetion/hands_off_wretch.wav"),
    GRRRAH("Grrrah!", "vetion/grrrah.wav"),
    GRRRAH_2("GRRRAH!", "vetion/grrrah.wav"),
    TIME_TO_FEAST_HOUNDS("Time to feast, hounds!", "vetion/time_to_feast_hounds.wav"),
    TIME_TO_FEAST_HOUNDS_2("TIME TO FEAST, HOUNDS!", "vetion/time_to_feast_hounds.wav"),
    HOUNDS_DISPOSE_OF_THESE_TRESSPASSERS("Hounds! Dispose of these tresspassers!", "vetion/hounds_dispose_of_these_tresspassers.wav"),
    HOUNDS_DISPOSE_OF_THESE_TRESSPASSERS_2("HOUNDS! DISPOSE OF THESE TRESSPASSERS!", "vetion/hounds_dispose_of_these_tresspassers.wav"),
    NOW_DO_IT_AGAIN("Now... DO IT AGAIN!!!", "vetion/now_do_it_again.wav"),
    DODGE_THIS("Dodge this!", "vetion/dodge_this.wav"),
    DODGE_THIS_2("DODGE THIS!", "vetion/dodge_this.wav"),
    PERISH_FOOL("Perish, fool!", "vetion/perish_fool.wav"),
    PERISH_FOOL_2("PERISH, FOOL!", "vetion/perish_fool.wav"),
    YOU_ARE_POWERLESS_TO_ME("You are powerless to me!", "vetion/you_are_powerless_to_me.wav"),
    YOU_ARE_POWERLESS_TO_ME_2("YOU ARE POWERLESS TO ME!", "vetion/you_are_powerless_to_me.wav"),
    TIME_TO_DIE_MORTAL("Time to die, mortal!", "vetion/time_to_die_mortal.wav"),
    TIME_TO_DIE_MORTAL_2("TIME TO DIE, MORTAL!", "vetion/time_to_die_mortal.wav"),
    FILTHY_WHELPS("Filthy whelps!", "vetion/filthy_whelps.wav"),
    FILTHY_WHELPS_2("FILTHY WHELPS!", "vetion/filthy_whelps.wav"),
    YOURE_NOT_BLOCKING_THIS_ONE("You're not blocking this one!", "vetion/youre_not_blocking_this_one.wav"),
    YOURE_NOT_BLOCKING_THIS_ONE_2("YOU'RE NOT BLOCKING THIS ONE!", "vetion/youre_not_blocking_this_one.wav"),
    DEFEND_YOURSELF("Defend yourself!", "vetion/defend_yourself.wav"),
    DEFEND_YOURSELF_2("DEFEND YOURSELF!", "vetion/defend_yourself.wav"),
    MUST_I_DO_EVERYTHING_AROUND_HERE("Must I do everything around here?!", "vetion/must_i_do_everything_around_here.wav"),
    MUST_I_DO_EVERYTHING_AROUND_HERE_2("MUST I DO EVERYTHING AROUND HERE?!", "vetion/must_i_do_everything_around_here.wav"),
    ILL_KILL_YOU_FOR_KILLING_MY_PETS("I'll kill you for killing my pets!", "vetion/ill_kill_you_for_killing_my_pets.wav"),
    ILL_KILL_YOU_FOR_KILLING_MY_PETS_2("I'LL KILL YOU FOR KILLING MY PETS!", "vetion/ill_kill_you_for_killing_my_pets.wav"),
    URGH_NOT_AGAIN("Urgh... not... again...", "vetion/not_again.wav"),
    URK_I_FAILED("Urk! I... failed...", "vetion/i_failed.wav"),
    ILL_BE_BACK("I'll... be... back...", "vetion/ill_be_back.wav"),
    THIS_ISNT_THE_LAST_OF_ME("This isn't... the last... of me...", "vetion/this_isnt_the_last_of_me.wav"),
    MY_LORD_IM_SORRY("My lord... I'm... sorry...", "vetion/my_lord_im_sorry.wav"),
    ILL_GET_YOU_NEXT_TIME("I'll get you... next... time...", "vetion/ill_get_you_next_time.wav"),
    DIE("Die!", "vetion/die.wav"),
    DIE_2("DIE!", "vetion/die.wav"),
    DIE_RODENT("Die, rodent!", "vetion/die_rodent.wav"),
    DIE_RODENT_2("DIE, RODENT!", "vetion/die_rodent.wav"),
    HOLD_STILL_SO_I_CAN_SMITE_YOU("Hold still so I can smite you!", "vetion/hold_still_so_I_can_smite_you.wav"),
    HOLD_STILL_SO_I_CAN_SMITE_YOU_2("HOLD STILL SO I CAN SMITE YOU!", "vetion/hold_still_so_I_can_smite_you.wav"),
    YOURE_MINE_NOW("You're mine now!", "vetion/youre_mine_now.wav"),
    YOURE_MINE_NOW_2("YOU'RE MINE NOW!", "vetion/youre_mine_now.wav"),
    RAAARGH("Raaargh!", "vetion/raaargh.wav"),
    RAAARGH_2("RAAARGH!", "vetion/raaargh.wav"),
    WEAK_FEEBLE("You are weak! You are feeble!", "vetion/you_are_weak_you_are_feeble.wav"),
    WEAK_FEEBLE_2("YOU ARE WEAK! YOU ARE FEEBLE!", "vetion/you_are_weak_you_are_feeble.wav"),
    ILL_CUT_YOU_DOWN("I will cut you down!", "vetion/ill_cut_you_down.wav"),
    ILL_CUT_YOU_DOWN_2("I WILL CUT YOU DOWN!", "vetion/ill_cut_you_down.wav"),
    ILL_END_YOU("I will end you!", "vetion/ill_end_you.wav"),
    ILL_END_YOU_2("I WILL END YOU!", "vetion/ill_end_you.wav"),
    TAKE_THIS("Take this!", "vetion/take_this.wav"),
    TAKE_THIS_2("TAKE THIS!", "vetion/take_this.wav"),
    TOO_CLOSE("Too close!", "vetion/too_close.wav"),
    TOO_CLOSE_2("TOO CLOSE!", "vetion/too_close.wav"),
    BACK_OFF_MUTT("Back off, mutt!", "vetion/back_off_mutt.wav"),
    BACK_OFF_MUTT_2("BACK OFF, MUTT!", "vetion/back_off_mutt.wav"),
    HOUNDS_GET_THEM("Gah! Hounds! Get them!", "vetion/hounds_get_them.wav"),
    HOUNDS_GET_THEM_2("GAH! HOUNDS! GET THEM!", "vetion/hounds_get_them.wav"),
    ENOUGH_OF_THIS("I've had enough of this! Hounds!", "vetion/enough_of_this.wav"),
    ENOUGH_OF_THIS_2("I'VE HAD ENOUGH OF THIS! HOUNDS!", "vetion/enough_of_this.wav"),
    GO_FORTH_MY_HOUNDS("Go forth, my hounds, and destroy them!", "vetion/go_forth_my_hounds.wav"),
    GET_RID_OF_THESE_INTERLOPERS("Hounds! Get rid of these interlopers!", "vetion/get_rid_of_these_interlopers.wav"),
    GET_RID_OF_THESE_INTERLOPERS_2("HOUNDS! GET RID OF THESE INTERLOPERS!", "vetion/get_rid_of_these_interlopers.wav"),
    GO_FORTH_MY_HOUNDS_2("GO FORTH, MY HOUNDS, AND DESTROY THEM!", "vetion/go_forth_my_hounds.wav"),
    FINE_ILL_DEAL_WITH_YOU_MYSELF("Fine! I'll deal with you myself!", "vetion/fine_ill_deal_with_you_myself.wav"),
    FINE_ILL_DEAL_WITH_YOU_MYSELF_2("FINE! I'LL DEAL WITH YOU MYSELF!", "vetion/fine_ill_deal_with_you_myself.wav"),
    MAKE_YOU_PAY("My hounds! I'll make you pay for that!", "vetion/make_you_pay.wav"),
    MAKE_YOU_PAY_2("MY HOUNDS! I'LL MAKE YOU PAY FOR THAT!", "vetion/make_you_pay.wav"),

    // Minimus & Sol Overhead text
    ROOKIE("A Rookie approaches!","sol/overhead/rookie.wav"),
    BRAWLER("A Brawler approaches!","sol/overhead/brawler.wav"),
    CHALLENGER("A Challenger approaches!","sol/overhead/challenger.wav"),
    GLADIATOR("A Gladiator approaches!","sol/overhead/gladiator.wav"),
    HERO("A Hero approaches!","sol/overhead/hero.wav"),
    CHAMPION("A Champion approaches!","sol/overhead/champion.wav"),
    GRAND_CHAMPION("A Grand Champion approaches!","sol/overhead/grand_champion.wav"),
    LET_ME_KNOW("Let me know when you want to begin.","sol/overhead/let_me_know.wav"),
    FOOTWORK("Let's start by testing your footwork.","sol/overhead/testing_your_footwork.wav"),
    SOMETHING_ELSE("Not bad. Let's try something else...","sol/overhead/try_something_else.wav"),
    HANDLE_THIS("Impressive. Let's see how you handle this...","sol/overhead/see_how_you_handle_this.wav"),
    CANT_WIN("You can't win!","sol/overhead/you_cant_win.wav"),
    GUIDE_MY_HAND("Ralos guides my hand!","sol/overhead/ralos_guide_my_hand.wav"),
    END_THIS("LET'S END THIS!","sol/overhead/lets_end_this.wav"),
    BREAK_BACK("I'LL BREAK YOUR BACK!","sol/overhead/break_your_back.wav"),
    CRUSH_BODY("I'LL CRUSH YOUR BODY!","sol/overhead/crush_your_body.wav"),
    TWIST_HANDS("I'LL TWIST YOUR HANDS OFF!","sol/overhead/twist_your_hands_off.wav"),
    TWIST_D("I'LL TWIST YOUR D... OFF!","sol/overhead/twist_your_d_off.wav"),
    BREAK_LEGS("I'LL BREAK YOUR LEGS!","sol/overhead/break_your_legs.wav"),
    CUT_FEET("I'LL CUT YOUR FEET OFF!","sol/overhead/cut_your_feet_off.wav"),
    SHINES_BRIGHTLY("Your light shines... brightly...","sol/overhead/your_light_shines_brightly.wav"),
    WORTHY_OPPONENT("A worthy... opponent...","sol/overhead/a_worthy_opponent.wav"),
    SMILED_UPON_YOU("Ralos has smiled upon you...","sol/overhead/ralos_has_smiled_upon_you.wav"),
    COMPLIMENTS_CHAMPION("My compliments, champion...","sol/overhead/my_compliments_champion.wav"),
    DISAPPOINTING("How disappointing...","sol/overhead/how_disappointing.wav"),
    WERENT_THE_ONE("I knew you weren't the one.","sol/overhead/i_knew_you_werent_the_one.wav"),
    ALMOST_EXCITED("You almost had me excited for a moment.","sol/overhead/you_almost_had_me_excited_for_a_moment.wav"),
    LACK_OF_COORD("Your lack of coordination is concerning.","sol/overhead/your_lack_of_coordination_is_concerning.wav"),
    SHINES_NO_LONGER("Your light shines no longer.","sol/overhead/your_light_shines_no_longer.wav"),
    MAYBE_NEXT_TIME("Maybe next time...","sol/overhead/maybe_next_time.wav"),
    PATHETIC_REALLY("Pathetic, really...","sol/overhead/pathetic_really.wav");

    private static final Map<String, VoiceActing> triggerLines = new HashMap<>();

    static {
        for (VoiceActing voiceAct : values()) {
            triggerLines.put(voiceAct.triggerLine, voiceAct);
        }
    }

    private final String triggerLine;
    private final String file;

    VoiceActing(String triggerLine, String file) {
        this.triggerLine = triggerLine;
        this.file = file;
    }

    public static VoiceActing forTriggerLine(String triggerLine) {
        if (triggerLine.equals("I'LL TWIST YOUR HANDS OFF!")) {
            Random rand = new Random();
            int n = rand.nextInt(10);
            if (n == 9) {
                triggerLine = "I'LL TWIST YOUR D... OFF!"; // hehe...
            }
        }
        return triggerLines.get(triggerLine);
    }

    public String trigger() {
        return triggerLine;
    }

    public String file() {
        return file;
    }
}