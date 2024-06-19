package com.solvoicer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum VoiceActing {

    // Chatbox text (Minimus + Sol Heredit)
    WELCOME_GRAND_CHAMPION("Welcome, Grand Champion.", "chatbox/welcome_grand_champion.wav"),
    WORTHY_CHALLENGER("By Ralos, we finally have a worthy challenger.", "chatbox/worthy_challenger.wav"),
    ALMOST_IMPRESSED("You've torn through multiple waves of combatants and you're still standing. I'm almost impressed.", "chatbox/almost_impressed.wav"),
    REAL_FOE("Now let's see how you handle a real foe...","chatbox/real_foe.wav"),
    BACK_SO_SOON("You're back so soon? A lesser combatant would've retired in shame after the show you put on last time...", "chatbox/back_so_soon.wav"),
    CLEARLY_DIFFERENT("But you're clearly different. Let's see what you have this time...","chatbox/clearly_different.wav"),
    THIRD_TIME("What is it they say? Third time's the charm? Let's see if that's true.","chatbox/third_time_the_charm.wav"),
    TO_ARMS("To arms!","chatbox/to_arms.wav"),
    INCAPABLE_FIGHTER("You might be an incapable fighter, but at least you're persistent. Shall we?,","chatbox/incapable_fighter.wav"),

    // Overhead text (Sol Heredit)
    FOOTWORK("Let's start by testing your footwork.","overhead/testing_your_footwork.wav"),
    SOMETHING_ELSE("Not bad. Let's try something else...","overhead/try_something_else.wav"),
    HANDLE_THIS("Impressive. Let's see how you handle this...","overhead/see_how_you_handle_this.wav"),
    CANT_WIN("You can't win!","overhead/you_cant_win.wav"),
    GUIDE_MY_HAND("Ralos guides my hand!","overhead/ralos_guide_my_hand.wav"),
    END_THIS("LET'S END THIS!","overhead/lets_end_this.wav"),
    BREAK_BACK("I'LL BREAK YOUR BACK!","overhead/break_your_back.wav"),
    CRUSH_BODY("I'LL CRUSH YOUR BODY!","overhead/crush_your_body.wav"),
    TWIST_HANDS("I'LL TWIST YOUR HANDS OFF!","overhead/twist_your_hands_off.wav"),
    TWIST_D("I'LL TWIST YOUR D... OFF!","overhead/twist_your_d_off.wav"),
    BREAK_LEGS("I'LL BREAK YOUR LEGS!","overhead/break_your_legs.wav"),
    CUT_FEET("I'LL CUT YOUR FEET OFF!","overhead/cut_your_feet_off.wav"),
    SHINES_BRIGHTLY("Your light shines... brightly...","overhead/your_light_shines_brightly.wav"),
    WORTHY_OPPONENT("A worthy... opponent...","overhead/a_worthy_opponent.wav"),
    SMILED_UPON_YOU("Ralos has smiled upon you...","overhead/ralos_has_smiled_upon_you.wav"),
    COMPLIMENTS_CHAMPION("My compliments, champion...","overhead/my_compliments_champion.wav"),
    DISAPPOINTING("How disappointing...","overhead/how_disappointing.wav"),
    WERENT_THE_ONE("I knew you weren't the one.","overhead/i_knew_you_werent_the_one.wav"),
    ALMOST_EXCITED("You almost had me excited for a moment.","overhead/you_almost_had_me_excited_for_a_moment.wav"),
    LACK_OF_COORD("Your lack of coordination is concerning.","overhead/your_lack_of_coordination_is_concerning.wav"),
    SHINES_NO_LONGER("Your light shines no longer.","overhead/your_light_shines_no_longer.wav"),
    MAYBE_NEXT_TIME("Maybe next time...","overhead/maybe_next_time.wav"),
    PATHETIC("Pathetic, really...","overhead/pathetic_really.wav");

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
            int n = rand.nextInt(100);
            if (n == 42) {
                triggerLine = "I'LL TWIST YOUR D... OFF!"; // hehe
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