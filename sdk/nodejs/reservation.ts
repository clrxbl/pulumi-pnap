// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a phoenixNAP reservation resource. This can be used to create and modify reservations.
 *
 * ## Example Usage
 *
 * Create a reservation
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pnap from "@phoenixnap/pulumi-pnap";
 *
 * // Create a reservation
 * const test_Reservation_1 = new pnap.Reservation("test-Reservation-1", {sku: "XXX-XXX-XXX"});
 * ```
 */
export class Reservation extends pulumi.CustomResource {
    /**
     * Get an existing Reservation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReservationState, opts?: pulumi.CustomResourceOptions): Reservation {
        return new Reservation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pnap:index/reservation:Reservation';

    /**
     * Returns true if the given object is an instance of Reservation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Reservation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Reservation.__pulumiType;
    }

    /**
     * The resource ID currently being assigned to reservation.
     */
    public /*out*/ readonly assignedResourceId!: pulumi.Output<string>;
    /**
     * A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
     */
    public readonly autoRenew!: pulumi.Output<boolean>;
    /**
     * The reason for disabling auto-renewal.
     */
    public readonly autoRenewDisableReason!: pulumi.Output<string | undefined>;
    /**
     * The point in time (in UTC) when the reservation ends.
     */
    public /*out*/ readonly endDateTime!: pulumi.Output<string>;
    /**
     * Reservations created with initial invoice model ON_CREATION will be invoiced on same date when reservation is created. Reservation created with CALENDAR_MONTH initial invoice model will be invoiced at the begining of next month.
     */
    public /*out*/ readonly initialInvoiceModel!: pulumi.Output<string>;
    /**
     * The point in time (in UTC) when the reservation was renewed last.
     */
    public /*out*/ readonly lastRenewalDateTime!: pulumi.Output<string>;
    /**
     * The location code.
     */
    public /*out*/ readonly location!: pulumi.Output<string>;
    /**
     * Next billing date for reservation.
     */
    public /*out*/ readonly nextBillingDate!: pulumi.Output<string>;
    /**
     * The point in time (in UTC) when the reservation will be renewed if auto renew is set to true.
     */
    public /*out*/ readonly nextRenewalDateTime!: pulumi.Output<string>;
    /**
     * Reservation price.
     */
    public /*out*/ readonly price!: pulumi.Output<number>;
    /**
     * The unit to which the price applies.
     */
    public /*out*/ readonly priceUnit!: pulumi.Output<string>;
    /**
     * The product category.
     */
    public /*out*/ readonly productCategory!: pulumi.Output<string>;
    /**
     * The code identifying the product. This code has significance across all locations.
     */
    public /*out*/ readonly productCode!: pulumi.Output<string>;
    /**
     * The reservation model.
     */
    public /*out*/ readonly reservationModel!: pulumi.Output<string>;
    /**
     * The SKU code of product pricing plan.
     */
    public readonly sku!: pulumi.Output<string>;
    /**
     * The point in time (in UTC) when the reservation starts.
     */
    public /*out*/ readonly startDateTime!: pulumi.Output<string>;

    /**
     * Create a Reservation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ReservationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReservationArgs | ReservationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ReservationState | undefined;
            resourceInputs["assignedResourceId"] = state ? state.assignedResourceId : undefined;
            resourceInputs["autoRenew"] = state ? state.autoRenew : undefined;
            resourceInputs["autoRenewDisableReason"] = state ? state.autoRenewDisableReason : undefined;
            resourceInputs["endDateTime"] = state ? state.endDateTime : undefined;
            resourceInputs["initialInvoiceModel"] = state ? state.initialInvoiceModel : undefined;
            resourceInputs["lastRenewalDateTime"] = state ? state.lastRenewalDateTime : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["nextBillingDate"] = state ? state.nextBillingDate : undefined;
            resourceInputs["nextRenewalDateTime"] = state ? state.nextRenewalDateTime : undefined;
            resourceInputs["price"] = state ? state.price : undefined;
            resourceInputs["priceUnit"] = state ? state.priceUnit : undefined;
            resourceInputs["productCategory"] = state ? state.productCategory : undefined;
            resourceInputs["productCode"] = state ? state.productCode : undefined;
            resourceInputs["reservationModel"] = state ? state.reservationModel : undefined;
            resourceInputs["sku"] = state ? state.sku : undefined;
            resourceInputs["startDateTime"] = state ? state.startDateTime : undefined;
        } else {
            const args = argsOrState as ReservationArgs | undefined;
            if ((!args || args.sku === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sku'");
            }
            resourceInputs["autoRenew"] = args ? args.autoRenew : undefined;
            resourceInputs["autoRenewDisableReason"] = args ? args.autoRenewDisableReason : undefined;
            resourceInputs["sku"] = args ? args.sku : undefined;
            resourceInputs["assignedResourceId"] = undefined /*out*/;
            resourceInputs["endDateTime"] = undefined /*out*/;
            resourceInputs["initialInvoiceModel"] = undefined /*out*/;
            resourceInputs["lastRenewalDateTime"] = undefined /*out*/;
            resourceInputs["location"] = undefined /*out*/;
            resourceInputs["nextBillingDate"] = undefined /*out*/;
            resourceInputs["nextRenewalDateTime"] = undefined /*out*/;
            resourceInputs["price"] = undefined /*out*/;
            resourceInputs["priceUnit"] = undefined /*out*/;
            resourceInputs["productCategory"] = undefined /*out*/;
            resourceInputs["productCode"] = undefined /*out*/;
            resourceInputs["reservationModel"] = undefined /*out*/;
            resourceInputs["startDateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Reservation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Reservation resources.
 */
export interface ReservationState {
    /**
     * The resource ID currently being assigned to reservation.
     */
    assignedResourceId?: pulumi.Input<string>;
    /**
     * A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The reason for disabling auto-renewal.
     */
    autoRenewDisableReason?: pulumi.Input<string>;
    /**
     * The point in time (in UTC) when the reservation ends.
     */
    endDateTime?: pulumi.Input<string>;
    /**
     * Reservations created with initial invoice model ON_CREATION will be invoiced on same date when reservation is created. Reservation created with CALENDAR_MONTH initial invoice model will be invoiced at the begining of next month.
     */
    initialInvoiceModel?: pulumi.Input<string>;
    /**
     * The point in time (in UTC) when the reservation was renewed last.
     */
    lastRenewalDateTime?: pulumi.Input<string>;
    /**
     * The location code.
     */
    location?: pulumi.Input<string>;
    /**
     * Next billing date for reservation.
     */
    nextBillingDate?: pulumi.Input<string>;
    /**
     * The point in time (in UTC) when the reservation will be renewed if auto renew is set to true.
     */
    nextRenewalDateTime?: pulumi.Input<string>;
    /**
     * Reservation price.
     */
    price?: pulumi.Input<number>;
    /**
     * The unit to which the price applies.
     */
    priceUnit?: pulumi.Input<string>;
    /**
     * The product category.
     */
    productCategory?: pulumi.Input<string>;
    /**
     * The code identifying the product. This code has significance across all locations.
     */
    productCode?: pulumi.Input<string>;
    /**
     * The reservation model.
     */
    reservationModel?: pulumi.Input<string>;
    /**
     * The SKU code of product pricing plan.
     */
    sku?: pulumi.Input<string>;
    /**
     * The point in time (in UTC) when the reservation starts.
     */
    startDateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Reservation resource.
 */
export interface ReservationArgs {
    /**
     * A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The reason for disabling auto-renewal.
     */
    autoRenewDisableReason?: pulumi.Input<string>;
    /**
     * The SKU code of product pricing plan.
     */
    sku: pulumi.Input<string>;
}
