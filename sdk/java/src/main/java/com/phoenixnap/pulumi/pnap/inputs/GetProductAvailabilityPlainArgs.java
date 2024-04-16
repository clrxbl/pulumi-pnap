// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProductAvailabilityPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProductAvailabilityPlainArgs Empty = new GetProductAvailabilityPlainArgs();

    /**
     * The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
     * 
     */
    @Import(name="locations")
    private @Nullable List<String> locations;

    /**
     * @return The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
     * 
     */
    public Optional<List<String>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * Minimal quantity of product needed. Minimum, maximum and default values might differ for different products. For servers, they are 1, 10 and 1 respectively.
     * 
     */
    @Import(name="minQuantity")
    private @Nullable Double minQuantity;

    /**
     * @return Minimal quantity of product needed. Minimum, maximum and default values might differ for different products. For servers, they are 1, 10 and 1 respectively.
     * 
     */
    public Optional<Double> minQuantity() {
        return Optional.ofNullable(this.minQuantity);
    }

    /**
     * Product category. Currently only `SERVER` category is supported.
     * 
     */
    @Import(name="productCategories")
    private @Nullable List<String> productCategories;

    /**
     * @return Product category. Currently only `SERVER` category is supported.
     * 
     */
    public Optional<List<String>> productCategories() {
        return Optional.ofNullable(this.productCategories);
    }

    /**
     * The code identifying the product. This code has significance across all locations.
     * 
     */
    @Import(name="productCodes")
    private @Nullable List<String> productCodes;

    /**
     * @return The code identifying the product. This code has significance across all locations.
     * 
     */
    public Optional<List<String>> productCodes() {
        return Optional.ofNullable(this.productCodes);
    }

    /**
     * Show only locations where product with requested quantity is available or all locations where product is offered. Default value is `true`.
     * 
     */
    @Import(name="showOnlyMinQuantityAvailable")
    private @Nullable Boolean showOnlyMinQuantityAvailable;

    /**
     * @return Show only locations where product with requested quantity is available or all locations where product is offered. Default value is `true`.
     * 
     */
    public Optional<Boolean> showOnlyMinQuantityAvailable() {
        return Optional.ofNullable(this.showOnlyMinQuantityAvailable);
    }

    /**
     * Currently only the following value is allowed: `SERVER_RANCHER`.
     * 
     */
    @Import(name="solutions")
    private @Nullable List<String> solutions;

    /**
     * @return Currently only the following value is allowed: `SERVER_RANCHER`.
     * 
     */
    public Optional<List<String>> solutions() {
        return Optional.ofNullable(this.solutions);
    }

    private GetProductAvailabilityPlainArgs() {}

    private GetProductAvailabilityPlainArgs(GetProductAvailabilityPlainArgs $) {
        this.locations = $.locations;
        this.minQuantity = $.minQuantity;
        this.productCategories = $.productCategories;
        this.productCodes = $.productCodes;
        this.showOnlyMinQuantityAvailable = $.showOnlyMinQuantityAvailable;
        this.solutions = $.solutions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProductAvailabilityPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProductAvailabilityPlainArgs $;

        public Builder() {
            $ = new GetProductAvailabilityPlainArgs();
        }

        public Builder(GetProductAvailabilityPlainArgs defaults) {
            $ = new GetProductAvailabilityPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locations The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
         * 
         * @return builder
         * 
         */
        public Builder locations(@Nullable List<String> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param minQuantity Minimal quantity of product needed. Minimum, maximum and default values might differ for different products. For servers, they are 1, 10 and 1 respectively.
         * 
         * @return builder
         * 
         */
        public Builder minQuantity(@Nullable Double minQuantity) {
            $.minQuantity = minQuantity;
            return this;
        }

        /**
         * @param productCategories Product category. Currently only `SERVER` category is supported.
         * 
         * @return builder
         * 
         */
        public Builder productCategories(@Nullable List<String> productCategories) {
            $.productCategories = productCategories;
            return this;
        }

        /**
         * @param productCategories Product category. Currently only `SERVER` category is supported.
         * 
         * @return builder
         * 
         */
        public Builder productCategories(String... productCategories) {
            return productCategories(List.of(productCategories));
        }

        /**
         * @param productCodes The code identifying the product. This code has significance across all locations.
         * 
         * @return builder
         * 
         */
        public Builder productCodes(@Nullable List<String> productCodes) {
            $.productCodes = productCodes;
            return this;
        }

        /**
         * @param productCodes The code identifying the product. This code has significance across all locations.
         * 
         * @return builder
         * 
         */
        public Builder productCodes(String... productCodes) {
            return productCodes(List.of(productCodes));
        }

        /**
         * @param showOnlyMinQuantityAvailable Show only locations where product with requested quantity is available or all locations where product is offered. Default value is `true`.
         * 
         * @return builder
         * 
         */
        public Builder showOnlyMinQuantityAvailable(@Nullable Boolean showOnlyMinQuantityAvailable) {
            $.showOnlyMinQuantityAvailable = showOnlyMinQuantityAvailable;
            return this;
        }

        /**
         * @param solutions Currently only the following value is allowed: `SERVER_RANCHER`.
         * 
         * @return builder
         * 
         */
        public Builder solutions(@Nullable List<String> solutions) {
            $.solutions = solutions;
            return this;
        }

        /**
         * @param solutions Currently only the following value is allowed: `SERVER_RANCHER`.
         * 
         * @return builder
         * 
         */
        public Builder solutions(String... solutions) {
            return solutions(List.of(solutions));
        }

        public GetProductAvailabilityPlainArgs build() {
            return $;
        }
    }

}
