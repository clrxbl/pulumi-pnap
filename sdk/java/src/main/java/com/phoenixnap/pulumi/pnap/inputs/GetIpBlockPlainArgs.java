// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpBlockPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpBlockPlainArgs Empty = new GetIpBlockPlainArgs();

    /**
     * The IP Block in CIDR notation.
     * 
     */
    @Import(name="cidr")
    private @Nullable String cidr;

    /**
     * @return The IP Block in CIDR notation.
     * 
     */
    public Optional<String> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * The IP Block identifier.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The IP Block identifier.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetIpBlockPlainArgs() {}

    private GetIpBlockPlainArgs(GetIpBlockPlainArgs $) {
        this.cidr = $.cidr;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpBlockPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpBlockPlainArgs $;

        public Builder() {
            $ = new GetIpBlockPlainArgs();
        }

        public Builder(GetIpBlockPlainArgs defaults) {
            $ = new GetIpBlockPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr The IP Block in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable String cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param id The IP Block identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetIpBlockPlainArgs build() {
            return $;
        }
    }

}