public boolean sleepIn(boolean weekday, boolean vacation) {
    // We can sleep in if it's not a weekday or if we're on vacation
    if (!weekday || vacation) {
        return true;
    } else {
      return false;
    }
}