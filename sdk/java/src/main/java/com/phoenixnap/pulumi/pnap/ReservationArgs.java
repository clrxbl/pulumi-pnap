// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    /**
     * A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
     * 
     */
    @Import(name="autoRenew")
    private @Nullable Output<Boolean> autoRenew;

    /**
     * @return A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
     * 
     */
    public Optional<Output<Boolean>> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }

    /**
     * The reason for disabling auto-renewal.
     * 
     */
    @Import(name="autoRenewDisableReason")
    private @Nullable Output<String> autoRenewDisableReason;

    /**
     * @return The reason for disabling auto-renewal.
     * 
     */
    public Optional<Output<String>> autoRenewDisableReason() {
        return Optional.ofNullable(this.autoRenewDisableReason);
    }

    /**
     * The SKU code of product pricing plan.
     * 
     */
    @Import(name="sku", required=true)
    private Output<String> sku;

    /**
     * @return The SKU code of product pricing plan.
     * 
     */
    public Output<String> sku() {
        return this.sku;
    }

    private ReservationArgs() {}

    private ReservationArgs(ReservationArgs $) {
        this.autoRenew = $.autoRenew;
        this.autoRenewDisableReason = $.autoRenewDisableReason;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationArgs $;

        public Builder() {
            $ = new ReservationArgs();
        }

        public Builder(ReservationArgs defaults) {
            $ = new ReservationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRenew A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            $.autoRenew = autoRenew;
            return this;
        }

        /**
         * @param autoRenew A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(Boolean autoRenew) {
            return autoRenew(Output.of(autoRenew));
        }

        /**
         * @param autoRenewDisableReason The reason for disabling auto-renewal.
         * 
         * @return builder
         * 
         */
        public Builder autoRenewDisableReason(@Nullable Output<String> autoRenewDisableReason) {
            $.autoRenewDisableReason = autoRenewDisableReason;
            return this;
        }

        /**
         * @param autoRenewDisableReason The reason for disabling auto-renewal.
         * 
         * @return builder
         * 
         */
        public Builder autoRenewDisableReason(String autoRenewDisableReason) {
            return autoRenewDisableReason(Output.of(autoRenewDisableReason));
        }

        /**
         * @param sku The SKU code of product pricing plan.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU code of product pricing plan.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public ReservationArgs build() {
            if ($.sku == null) {
                throw new MissingRequiredPropertyException("ReservationArgs", "sku");
            }
            return $;
        }
    }

}
