// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetProductAvailabilityProductAvailabilityLocationAvailabilityDetail {
    /**
     * @return Total available quantity of product in specific location. Max value is 10.
     * 
     */
    private Integer availableQuantity;
    /**
     * @return The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
     * 
     */
    private String location;
    /**
     * @return Is product available in specific location for requested quantity.
     * 
     */
    private Boolean minQuantityAvailable;
    /**
     * @return Requested quantity.
     * 
     */
    private Integer minQuantityRequested;
    /**
     * @return Solutions supported in specific location for a product.
     * 
     */
    private List<String> solutions;

    private GetProductAvailabilityProductAvailabilityLocationAvailabilityDetail() {}
    /**
     * @return Total available quantity of product in specific location. Max value is 10.
     * 
     */
    public Integer availableQuantity() {
        return this.availableQuantity;
    }
    /**
     * @return The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Is product available in specific location for requested quantity.
     * 
     */
    public Boolean minQuantityAvailable() {
        return this.minQuantityAvailable;
    }
    /**
     * @return Requested quantity.
     * 
     */
    public Integer minQuantityRequested() {
        return this.minQuantityRequested;
    }
    /**
     * @return Solutions supported in specific location for a product.
     * 
     */
    public List<String> solutions() {
        return this.solutions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductAvailabilityProductAvailabilityLocationAvailabilityDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer availableQuantity;
        private String location;
        private Boolean minQuantityAvailable;
        private Integer minQuantityRequested;
        private List<String> solutions;
        public Builder() {}
        public Builder(GetProductAvailabilityProductAvailabilityLocationAvailabilityDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableQuantity = defaults.availableQuantity;
    	      this.location = defaults.location;
    	      this.minQuantityAvailable = defaults.minQuantityAvailable;
    	      this.minQuantityRequested = defaults.minQuantityRequested;
    	      this.solutions = defaults.solutions;
        }

        @CustomType.Setter
        public Builder availableQuantity(Integer availableQuantity) {
            if (availableQuantity == null) {
              throw new MissingRequiredPropertyException("GetProductAvailabilityProductAvailabilityLocationAvailabilityDetail", "availableQuantity");
            }
            this.availableQuantity = availableQuantity;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetProductAvailabilityProductAvailabilityLocationAvailabilityDetail", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder minQuantityAvailable(Boolean minQuantityAvailable) {
            if (minQuantityAvailable == null) {
              throw new MissingRequiredPropertyException("GetProductAvailabilityProductAvailabilityLocationAvailabilityDetail", "minQuantityAvailable");
            }
            this.minQuantityAvailable = minQuantityAvailable;
            return this;
        }
        @CustomType.Setter
        public Builder minQuantityRequested(Integer minQuantityRequested) {
            if (minQuantityRequested == null) {
              throw new MissingRequiredPropertyException("GetProductAvailabilityProductAvailabilityLocationAvailabilityDetail", "minQuantityRequested");
            }
            this.minQuantityRequested = minQuantityRequested;
            return this;
        }
        @CustomType.Setter
        public Builder solutions(List<String> solutions) {
            if (solutions == null) {
              throw new MissingRequiredPropertyException("GetProductAvailabilityProductAvailabilityLocationAvailabilityDetail", "solutions");
            }
            this.solutions = solutions;
            return this;
        }
        public Builder solutions(String... solutions) {
            return solutions(List.of(solutions));
        }
        public GetProductAvailabilityProductAvailabilityLocationAvailabilityDetail build() {
            final var _resultValue = new GetProductAvailabilityProductAvailabilityLocationAvailabilityDetail();
            _resultValue.availableQuantity = availableQuantity;
            _resultValue.location = location;
            _resultValue.minQuantityAvailable = minQuantityAvailable;
            _resultValue.minQuantityRequested = minQuantityRequested;
            _resultValue.solutions = solutions;
            return _resultValue;
        }
    }
}