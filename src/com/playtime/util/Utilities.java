package com.playtime.util;

import net.md_5.bungee.api.ChatColor;

import java.util.concurrent.TimeUnit;

public class Utilities {

    public static String convertTime(int time) {
        int days = (int) TimeUnit.MINUTES.toDays(time);
        int hours = (int) (TimeUnit.MINUTES.toHours(time) - TimeUnit.DAYS.toHours(days));
        int minutes = (int) (TimeUnit.MINUTES.toMinutes(time) - TimeUnit.HOURS.toMinutes(hours)
                - TimeUnit.DAYS.toMinutes(days));

        String d = ChatColor.GRAY + "" + days + ChatColor.WHITE + " day";
        String h = ChatColor.GRAY + "" + hours + ChatColor.WHITE + " hour";
        String m = ChatColor.GRAY + "" + minutes + ChatColor.WHITE + " minute";
        String c = ChatColor.WHITE + ", ";

        if(days == 0) {
            if(hours == 0) {
                if(minutes == 1) {
                    return m;
                } else {
                    return m + "s";
                }
            } else {
                if(hours == 1) {
                    if(minutes == 1) {
                        return h + c + m;
                    } else {
                        if(minutes == 0) {
                            return h;
                        }
                        return h + c + m + "s";
                    }
                } else {
                    if(minutes == 1) {
                        return h + "s" + c + m;
                    } else {
                        if (minutes == 0) {
                            return h + "s";
                        }
                        return h + "s" + c + m + "s";
                    }
                }
            }
        } else {
            if(days == 1) {
                if(hours == 1) {
                    if(minutes == 1) {
                        return d + c + h + c + m;
                    } else {
                        if(minutes == 0) {
                            return d + c + h;
                        }
                        return d + c + h + c + m + "s";
                    }
                } else {
                    if(minutes == 1) {
                        if(hours == 0) {
                            return d + c + m;
                        }
                        return d + c + h + "s" + c + m;
                    } else {
                        if(minutes == 0) {
                            if(hours == 0) {
                                return d;
                            }
                            return d + c + h + "s";
                        } else {
                            if(hours == 0) {
                                return d + c + m + "s";
                            }
                            return d + c + h + "s" + c + m + "s";
                        }
                    }
                }
            } else {
                if(hours == 1) {
                    if(minutes == 1) {
                        return d + "s" + c + h + c + m;
                    } else {
                        if(minutes == 0) {
                            return d + "s" + c + h;
                        }
                        return d + "s" + c + h + c + m + "s";
                    }
                } else {
                    if(minutes == 1) {
                        if(hours == 0) {
                            return d + "s" + c + m;
                        }
                        return d + "s" + c + h + "s" + c + m;
                    } else {
                        if(minutes == 0) {
                            if(hours == 0) {
                                return d + "s";
                            }
                            return d + "s" + c + h + "s";
                        } else {
                            if(hours == 0) {
                                return d + "s" + c + m + "s";
                            }
                            return d + "s" + c + h + "s" + c + m + "s";
                        }

                    }
                }
            }
        }
    }

    public static String format(String m) {
        return ChatColor.translateAlternateColorCodes('&', m);
    }
}
