// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a phoenixNAP product availability datasource. This can be used to read product availabilities.
 *
 * ## Example Usage
 *
 * Fetch product availabilities by product category, product codes and locations.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pnap from "@pulumi/pnap";
 *
 * const query-1 = pnap.getProductAvailability({
 *     productCategories: ["SERVER"],
 *     productCodes: [
 *         "s1.c1.small",
 *         "s1.c1.medium",
 *     ],
 *     locations: [
 *         "PHX",
 *         "ASH",
 *     ],
 * });
 * export const availabilities = query_1.then(query_1 => query_1.productAvailabilities);
 * ```
 */
export function getProductAvailability(args?: GetProductAvailabilityArgs, opts?: pulumi.InvokeOptions): Promise<GetProductAvailabilityResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pnap:index/getProductAvailability:getProductAvailability", {
        "locations": args.locations,
        "minQuantity": args.minQuantity,
        "productCategories": args.productCategories,
        "productCodes": args.productCodes,
        "showOnlyMinQuantityAvailable": args.showOnlyMinQuantityAvailable,
        "solutions": args.solutions,
    }, opts);
}

/**
 * A collection of arguments for invoking getProductAvailability.
 */
export interface GetProductAvailabilityArgs {
    /**
     * The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
     */
    locations?: string[];
    /**
     * Minimal quantity of product needed. Minimum, maximum and default values might differ for different products. For servers, they are 1, 10 and 1 respectively.
     */
    minQuantity?: number;
    /**
     * Product category. Currently only `SERVER` category is supported.
     */
    productCategories?: string[];
    /**
     * The code identifying the product. This code has significance across all locations.
     */
    productCodes?: string[];
    /**
     * Show only locations where product with requested quantity is available or all locations where product is offered. Default value is `true`.
     */
    showOnlyMinQuantityAvailable?: boolean;
    /**
     * Currently only the following value is allowed: `SERVER_RANCHER`.
     */
    solutions?: string[];
}

/**
 * A collection of values returned by getProductAvailability.
 */
export interface GetProductAvailabilityResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The code identifying the location.
     */
    readonly locations?: string[];
    readonly minQuantity?: number;
    /**
     * List of product availabilities.
     */
    readonly productAvailabilities: outputs.GetProductAvailabilityProductAvailability[];
    /**
     * The product category.
     */
    readonly productCategories?: string[];
    /**
     * The code identifying the product.
     */
    readonly productCodes?: string[];
    readonly showOnlyMinQuantityAvailable?: boolean;
    readonly solutions?: string[];
}
/**
 * Provides a phoenixNAP product availability datasource. This can be used to read product availabilities.
 *
 * ## Example Usage
 *
 * Fetch product availabilities by product category, product codes and locations.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pnap from "@pulumi/pnap";
 *
 * const query-1 = pnap.getProductAvailability({
 *     productCategories: ["SERVER"],
 *     productCodes: [
 *         "s1.c1.small",
 *         "s1.c1.medium",
 *     ],
 *     locations: [
 *         "PHX",
 *         "ASH",
 *     ],
 * });
 * export const availabilities = query_1.then(query_1 => query_1.productAvailabilities);
 * ```
 */
export function getProductAvailabilityOutput(args?: GetProductAvailabilityOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProductAvailabilityResult> {
    return pulumi.output(args).apply((a: any) => getProductAvailability(a, opts))
}

/**
 * A collection of arguments for invoking getProductAvailability.
 */
export interface GetProductAvailabilityOutputArgs {
    /**
     * The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
     */
    locations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Minimal quantity of product needed. Minimum, maximum and default values might differ for different products. For servers, they are 1, 10 and 1 respectively.
     */
    minQuantity?: pulumi.Input<number>;
    /**
     * Product category. Currently only `SERVER` category is supported.
     */
    productCategories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The code identifying the product. This code has significance across all locations.
     */
    productCodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Show only locations where product with requested quantity is available or all locations where product is offered. Default value is `true`.
     */
    showOnlyMinQuantityAvailable?: pulumi.Input<boolean>;
    /**
     * Currently only the following value is allowed: `SERVER_RANCHER`.
     */
    solutions?: pulumi.Input<pulumi.Input<string>[]>;
}
