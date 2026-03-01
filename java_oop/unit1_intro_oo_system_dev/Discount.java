package unit1_intro_oo_system_dev;

import java.time.LocalDateTime;

public class Discount {
    private LocalDateTime startDiscount;
    private LocalDateTime endDiscount;
    private double percentage;

    public double getPercentage() {
        return this.percentage;
    }

    public LocalDateTime getStartDiscount() {
        return this.startDiscount;
    }

    public LocalDateTime getEndDiscount() {
        return this.endDiscount;
    }


    public void setPercentage(double percentage) {
        if (percentage > 0 && percentage <= 50) {
            this.percentage = percentage;
        }
    }

    public void setStartDiscount(LocalDateTime start) {
        LocalDateTime now = LocalDateTime.now();
        if (start.compareTo(now) > 0) {
            this.startDiscount = start;
        }

    }

    public void setEndDiscount(LocalDateTime end) {
        LocalDateTime now = LocalDateTime.now();
        if (end.compareTo(now) > 0 && end.compareTo(this.startDiscount) > 0) {
            this.endDiscount = end;
        }
    }

    // MISSING IMPORTANT METHODS THAT DEMOSTRATE ENCAPSULATION PRINCIPLE

    public boolean isActive() {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(startDiscount) && now.isBefore(endDiscount);
    }

    public double calculateDiscountedPrice(double originalPrice) {
        if (isActive()) {
            return originalPrice * (1 - this.percentage / 100);
        }
        return originalPrice;
    }


}
