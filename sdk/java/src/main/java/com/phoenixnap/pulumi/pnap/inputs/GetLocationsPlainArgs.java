// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocationsPlainArgs Empty = new GetLocationsPlainArgs();

    /**
     * The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The product category. Currently the following values are allowed: `SERVER`, `BANDWIDTH`, `OPERATING_SYSTEM`, `PUBLIC_IP` and `STORAGE`.
     * 
     */
    @Import(name="productCategory")
    private @Nullable String productCategory;

    /**
     * @return The product category. Currently the following values are allowed: `SERVER`, `BANDWIDTH`, `OPERATING_SYSTEM`, `PUBLIC_IP` and `STORAGE`.
     * 
     */
    public Optional<String> productCategory() {
        return Optional.ofNullable(this.productCategory);
    }

    private GetLocationsPlainArgs() {}

    private GetLocationsPlainArgs(GetLocationsPlainArgs $) {
        this.location = $.location;
        this.productCategory = $.productCategory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocationsPlainArgs $;

        public Builder() {
            $ = new GetLocationsPlainArgs();
        }

        public Builder(GetLocationsPlainArgs defaults) {
            $ = new GetLocationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param productCategory The product category. Currently the following values are allowed: `SERVER`, `BANDWIDTH`, `OPERATING_SYSTEM`, `PUBLIC_IP` and `STORAGE`.
         * 
         * @return builder
         * 
         */
        public Builder productCategory(@Nullable String productCategory) {
            $.productCategory = productCategory;
            return this;
        }

        public GetLocationsPlainArgs build() {
            return $;
        }
    }

}