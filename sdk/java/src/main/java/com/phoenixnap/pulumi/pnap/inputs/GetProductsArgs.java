// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProductsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProductsArgs Empty = new GetProductsArgs();

    /**
     * The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA`, `AUS` and `GLOBAL`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA`, `AUS` and `GLOBAL`.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The product category.
     * 
     */
    @Import(name="productCategory")
    private @Nullable Output<String> productCategory;

    /**
     * @return The product category.
     * 
     */
    public Optional<Output<String>> productCategory() {
        return Optional.ofNullable(this.productCategory);
    }

    /**
     * The code identifying the product. This code has significance across all locations.
     * 
     */
    @Import(name="productCode")
    private @Nullable Output<String> productCode;

    /**
     * @return The code identifying the product. This code has significance across all locations.
     * 
     */
    public Optional<Output<String>> productCode() {
        return Optional.ofNullable(this.productCode);
    }

    /**
     * The SKU identifier.
     * 
     */
    @Import(name="skuCode")
    private @Nullable Output<String> skuCode;

    /**
     * @return The SKU identifier.
     * 
     */
    public Optional<Output<String>> skuCode() {
        return Optional.ofNullable(this.skuCode);
    }

    private GetProductsArgs() {}

    private GetProductsArgs(GetProductsArgs $) {
        this.location = $.location;
        this.productCategory = $.productCategory;
        this.productCode = $.productCode;
        this.skuCode = $.skuCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProductsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProductsArgs $;

        public Builder() {
            $ = new GetProductsArgs();
        }

        public Builder(GetProductsArgs defaults) {
            $ = new GetProductsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA`, `AUS` and `GLOBAL`.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA`, `AUS` and `GLOBAL`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param productCategory The product category.
         * 
         * @return builder
         * 
         */
        public Builder productCategory(@Nullable Output<String> productCategory) {
            $.productCategory = productCategory;
            return this;
        }

        /**
         * @param productCategory The product category.
         * 
         * @return builder
         * 
         */
        public Builder productCategory(String productCategory) {
            return productCategory(Output.of(productCategory));
        }

        /**
         * @param productCode The code identifying the product. This code has significance across all locations.
         * 
         * @return builder
         * 
         */
        public Builder productCode(@Nullable Output<String> productCode) {
            $.productCode = productCode;
            return this;
        }

        /**
         * @param productCode The code identifying the product. This code has significance across all locations.
         * 
         * @return builder
         * 
         */
        public Builder productCode(String productCode) {
            return productCode(Output.of(productCode));
        }

        /**
         * @param skuCode The SKU identifier.
         * 
         * @return builder
         * 
         */
        public Builder skuCode(@Nullable Output<String> skuCode) {
            $.skuCode = skuCode;
            return this;
        }

        /**
         * @param skuCode The SKU identifier.
         * 
         * @return builder
         * 
         */
        public Builder skuCode(String skuCode) {
            return skuCode(Output.of(skuCode));
        }

        public GetProductsArgs build() {
            return $;
        }
    }

}
