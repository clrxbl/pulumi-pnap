# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ReservationArgs', 'Reservation']

@pulumi.input_type
class ReservationArgs:
    def __init__(__self__, *,
                 sku: pulumi.Input[str],
                 auto_renew: Optional[pulumi.Input[bool]] = None,
                 auto_renew_disable_reason: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Reservation resource.
        :param pulumi.Input[str] sku: The SKU code of product pricing plan.
        :param pulumi.Input[bool] auto_renew: A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
        :param pulumi.Input[str] auto_renew_disable_reason: The reason for disabling auto-renewal.
        """
        pulumi.set(__self__, "sku", sku)
        if auto_renew is not None:
            pulumi.set(__self__, "auto_renew", auto_renew)
        if auto_renew_disable_reason is not None:
            pulumi.set(__self__, "auto_renew_disable_reason", auto_renew_disable_reason)

    @property
    @pulumi.getter
    def sku(self) -> pulumi.Input[str]:
        """
        The SKU code of product pricing plan.
        """
        return pulumi.get(self, "sku")

    @sku.setter
    def sku(self, value: pulumi.Input[str]):
        pulumi.set(self, "sku", value)

    @property
    @pulumi.getter(name="autoRenew")
    def auto_renew(self) -> Optional[pulumi.Input[bool]]:
        """
        A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
        """
        return pulumi.get(self, "auto_renew")

    @auto_renew.setter
    def auto_renew(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_renew", value)

    @property
    @pulumi.getter(name="autoRenewDisableReason")
    def auto_renew_disable_reason(self) -> Optional[pulumi.Input[str]]:
        """
        The reason for disabling auto-renewal.
        """
        return pulumi.get(self, "auto_renew_disable_reason")

    @auto_renew_disable_reason.setter
    def auto_renew_disable_reason(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auto_renew_disable_reason", value)


@pulumi.input_type
class _ReservationState:
    def __init__(__self__, *,
                 assigned_resource_id: Optional[pulumi.Input[str]] = None,
                 auto_renew: Optional[pulumi.Input[bool]] = None,
                 auto_renew_disable_reason: Optional[pulumi.Input[str]] = None,
                 end_date_time: Optional[pulumi.Input[str]] = None,
                 initial_invoice_model: Optional[pulumi.Input[str]] = None,
                 last_renewal_date_time: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 next_billing_date: Optional[pulumi.Input[str]] = None,
                 next_renewal_date_time: Optional[pulumi.Input[str]] = None,
                 price: Optional[pulumi.Input[float]] = None,
                 price_unit: Optional[pulumi.Input[str]] = None,
                 product_category: Optional[pulumi.Input[str]] = None,
                 product_code: Optional[pulumi.Input[str]] = None,
                 reservation_model: Optional[pulumi.Input[str]] = None,
                 sku: Optional[pulumi.Input[str]] = None,
                 start_date_time: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Reservation resources.
        :param pulumi.Input[str] assigned_resource_id: The resource ID currently being assigned to reservation.
        :param pulumi.Input[bool] auto_renew: A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
        :param pulumi.Input[str] auto_renew_disable_reason: The reason for disabling auto-renewal.
        :param pulumi.Input[str] end_date_time: The point in time (in UTC) when the reservation ends.
        :param pulumi.Input[str] initial_invoice_model: Reservations created with initial invoice model ON_CREATION will be invoiced on same date when reservation is created. Reservation created with CALENDAR_MONTH initial invoice model will be invoiced at the begining of next month.
        :param pulumi.Input[str] last_renewal_date_time: The point in time (in UTC) when the reservation was renewed last.
        :param pulumi.Input[str] location: The location code.
        :param pulumi.Input[str] next_billing_date: Next billing date for reservation.
        :param pulumi.Input[str] next_renewal_date_time: The point in time (in UTC) when the reservation will be renewed if auto renew is set to true.
        :param pulumi.Input[float] price: Reservation price.
        :param pulumi.Input[str] price_unit: The unit to which the price applies.
        :param pulumi.Input[str] product_category: The product category.
        :param pulumi.Input[str] product_code: The code identifying the product. This code has significance across all locations.
        :param pulumi.Input[str] reservation_model: The reservation model.
        :param pulumi.Input[str] sku: The SKU code of product pricing plan.
        :param pulumi.Input[str] start_date_time: The point in time (in UTC) when the reservation starts.
        """
        if assigned_resource_id is not None:
            pulumi.set(__self__, "assigned_resource_id", assigned_resource_id)
        if auto_renew is not None:
            pulumi.set(__self__, "auto_renew", auto_renew)
        if auto_renew_disable_reason is not None:
            pulumi.set(__self__, "auto_renew_disable_reason", auto_renew_disable_reason)
        if end_date_time is not None:
            pulumi.set(__self__, "end_date_time", end_date_time)
        if initial_invoice_model is not None:
            pulumi.set(__self__, "initial_invoice_model", initial_invoice_model)
        if last_renewal_date_time is not None:
            pulumi.set(__self__, "last_renewal_date_time", last_renewal_date_time)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if next_billing_date is not None:
            pulumi.set(__self__, "next_billing_date", next_billing_date)
        if next_renewal_date_time is not None:
            pulumi.set(__self__, "next_renewal_date_time", next_renewal_date_time)
        if price is not None:
            pulumi.set(__self__, "price", price)
        if price_unit is not None:
            pulumi.set(__self__, "price_unit", price_unit)
        if product_category is not None:
            pulumi.set(__self__, "product_category", product_category)
        if product_code is not None:
            pulumi.set(__self__, "product_code", product_code)
        if reservation_model is not None:
            pulumi.set(__self__, "reservation_model", reservation_model)
        if sku is not None:
            pulumi.set(__self__, "sku", sku)
        if start_date_time is not None:
            pulumi.set(__self__, "start_date_time", start_date_time)

    @property
    @pulumi.getter(name="assignedResourceId")
    def assigned_resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        The resource ID currently being assigned to reservation.
        """
        return pulumi.get(self, "assigned_resource_id")

    @assigned_resource_id.setter
    def assigned_resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "assigned_resource_id", value)

    @property
    @pulumi.getter(name="autoRenew")
    def auto_renew(self) -> Optional[pulumi.Input[bool]]:
        """
        A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
        """
        return pulumi.get(self, "auto_renew")

    @auto_renew.setter
    def auto_renew(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_renew", value)

    @property
    @pulumi.getter(name="autoRenewDisableReason")
    def auto_renew_disable_reason(self) -> Optional[pulumi.Input[str]]:
        """
        The reason for disabling auto-renewal.
        """
        return pulumi.get(self, "auto_renew_disable_reason")

    @auto_renew_disable_reason.setter
    def auto_renew_disable_reason(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auto_renew_disable_reason", value)

    @property
    @pulumi.getter(name="endDateTime")
    def end_date_time(self) -> Optional[pulumi.Input[str]]:
        """
        The point in time (in UTC) when the reservation ends.
        """
        return pulumi.get(self, "end_date_time")

    @end_date_time.setter
    def end_date_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date_time", value)

    @property
    @pulumi.getter(name="initialInvoiceModel")
    def initial_invoice_model(self) -> Optional[pulumi.Input[str]]:
        """
        Reservations created with initial invoice model ON_CREATION will be invoiced on same date when reservation is created. Reservation created with CALENDAR_MONTH initial invoice model will be invoiced at the begining of next month.
        """
        return pulumi.get(self, "initial_invoice_model")

    @initial_invoice_model.setter
    def initial_invoice_model(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "initial_invoice_model", value)

    @property
    @pulumi.getter(name="lastRenewalDateTime")
    def last_renewal_date_time(self) -> Optional[pulumi.Input[str]]:
        """
        The point in time (in UTC) when the reservation was renewed last.
        """
        return pulumi.get(self, "last_renewal_date_time")

    @last_renewal_date_time.setter
    def last_renewal_date_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_renewal_date_time", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The location code.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter(name="nextBillingDate")
    def next_billing_date(self) -> Optional[pulumi.Input[str]]:
        """
        Next billing date for reservation.
        """
        return pulumi.get(self, "next_billing_date")

    @next_billing_date.setter
    def next_billing_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "next_billing_date", value)

    @property
    @pulumi.getter(name="nextRenewalDateTime")
    def next_renewal_date_time(self) -> Optional[pulumi.Input[str]]:
        """
        The point in time (in UTC) when the reservation will be renewed if auto renew is set to true.
        """
        return pulumi.get(self, "next_renewal_date_time")

    @next_renewal_date_time.setter
    def next_renewal_date_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "next_renewal_date_time", value)

    @property
    @pulumi.getter
    def price(self) -> Optional[pulumi.Input[float]]:
        """
        Reservation price.
        """
        return pulumi.get(self, "price")

    @price.setter
    def price(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "price", value)

    @property
    @pulumi.getter(name="priceUnit")
    def price_unit(self) -> Optional[pulumi.Input[str]]:
        """
        The unit to which the price applies.
        """
        return pulumi.get(self, "price_unit")

    @price_unit.setter
    def price_unit(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "price_unit", value)

    @property
    @pulumi.getter(name="productCategory")
    def product_category(self) -> Optional[pulumi.Input[str]]:
        """
        The product category.
        """
        return pulumi.get(self, "product_category")

    @product_category.setter
    def product_category(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_category", value)

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> Optional[pulumi.Input[str]]:
        """
        The code identifying the product. This code has significance across all locations.
        """
        return pulumi.get(self, "product_code")

    @product_code.setter
    def product_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_code", value)

    @property
    @pulumi.getter(name="reservationModel")
    def reservation_model(self) -> Optional[pulumi.Input[str]]:
        """
        The reservation model.
        """
        return pulumi.get(self, "reservation_model")

    @reservation_model.setter
    def reservation_model(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reservation_model", value)

    @property
    @pulumi.getter
    def sku(self) -> Optional[pulumi.Input[str]]:
        """
        The SKU code of product pricing plan.
        """
        return pulumi.get(self, "sku")

    @sku.setter
    def sku(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sku", value)

    @property
    @pulumi.getter(name="startDateTime")
    def start_date_time(self) -> Optional[pulumi.Input[str]]:
        """
        The point in time (in UTC) when the reservation starts.
        """
        return pulumi.get(self, "start_date_time")

    @start_date_time.setter
    def start_date_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_date_time", value)


class Reservation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_renew: Optional[pulumi.Input[bool]] = None,
                 auto_renew_disable_reason: Optional[pulumi.Input[str]] = None,
                 sku: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a phoenixNAP reservation resource. This can be used to create and modify reservations.

        ## Example Usage

        Create a reservation

        ```python
        import pulumi
        import pulumi_pnap as pnap

        # Create a reservation
        test__reservation_1 = pnap.Reservation("test-Reservation-1", sku="XXX-XXX-XXX")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_renew: A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
        :param pulumi.Input[str] auto_renew_disable_reason: The reason for disabling auto-renewal.
        :param pulumi.Input[str] sku: The SKU code of product pricing plan.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ReservationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a phoenixNAP reservation resource. This can be used to create and modify reservations.

        ## Example Usage

        Create a reservation

        ```python
        import pulumi
        import pulumi_pnap as pnap

        # Create a reservation
        test__reservation_1 = pnap.Reservation("test-Reservation-1", sku="XXX-XXX-XXX")
        ```

        :param str resource_name: The name of the resource.
        :param ReservationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ReservationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_renew: Optional[pulumi.Input[bool]] = None,
                 auto_renew_disable_reason: Optional[pulumi.Input[str]] = None,
                 sku: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ReservationArgs.__new__(ReservationArgs)

            __props__.__dict__["auto_renew"] = auto_renew
            __props__.__dict__["auto_renew_disable_reason"] = auto_renew_disable_reason
            if sku is None and not opts.urn:
                raise TypeError("Missing required property 'sku'")
            __props__.__dict__["sku"] = sku
            __props__.__dict__["assigned_resource_id"] = None
            __props__.__dict__["end_date_time"] = None
            __props__.__dict__["initial_invoice_model"] = None
            __props__.__dict__["last_renewal_date_time"] = None
            __props__.__dict__["location"] = None
            __props__.__dict__["next_billing_date"] = None
            __props__.__dict__["next_renewal_date_time"] = None
            __props__.__dict__["price"] = None
            __props__.__dict__["price_unit"] = None
            __props__.__dict__["product_category"] = None
            __props__.__dict__["product_code"] = None
            __props__.__dict__["reservation_model"] = None
            __props__.__dict__["start_date_time"] = None
        super(Reservation, __self__).__init__(
            'pnap:index/reservation:Reservation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            assigned_resource_id: Optional[pulumi.Input[str]] = None,
            auto_renew: Optional[pulumi.Input[bool]] = None,
            auto_renew_disable_reason: Optional[pulumi.Input[str]] = None,
            end_date_time: Optional[pulumi.Input[str]] = None,
            initial_invoice_model: Optional[pulumi.Input[str]] = None,
            last_renewal_date_time: Optional[pulumi.Input[str]] = None,
            location: Optional[pulumi.Input[str]] = None,
            next_billing_date: Optional[pulumi.Input[str]] = None,
            next_renewal_date_time: Optional[pulumi.Input[str]] = None,
            price: Optional[pulumi.Input[float]] = None,
            price_unit: Optional[pulumi.Input[str]] = None,
            product_category: Optional[pulumi.Input[str]] = None,
            product_code: Optional[pulumi.Input[str]] = None,
            reservation_model: Optional[pulumi.Input[str]] = None,
            sku: Optional[pulumi.Input[str]] = None,
            start_date_time: Optional[pulumi.Input[str]] = None) -> 'Reservation':
        """
        Get an existing Reservation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] assigned_resource_id: The resource ID currently being assigned to reservation.
        :param pulumi.Input[bool] auto_renew: A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
        :param pulumi.Input[str] auto_renew_disable_reason: The reason for disabling auto-renewal.
        :param pulumi.Input[str] end_date_time: The point in time (in UTC) when the reservation ends.
        :param pulumi.Input[str] initial_invoice_model: Reservations created with initial invoice model ON_CREATION will be invoiced on same date when reservation is created. Reservation created with CALENDAR_MONTH initial invoice model will be invoiced at the begining of next month.
        :param pulumi.Input[str] last_renewal_date_time: The point in time (in UTC) when the reservation was renewed last.
        :param pulumi.Input[str] location: The location code.
        :param pulumi.Input[str] next_billing_date: Next billing date for reservation.
        :param pulumi.Input[str] next_renewal_date_time: The point in time (in UTC) when the reservation will be renewed if auto renew is set to true.
        :param pulumi.Input[float] price: Reservation price.
        :param pulumi.Input[str] price_unit: The unit to which the price applies.
        :param pulumi.Input[str] product_category: The product category.
        :param pulumi.Input[str] product_code: The code identifying the product. This code has significance across all locations.
        :param pulumi.Input[str] reservation_model: The reservation model.
        :param pulumi.Input[str] sku: The SKU code of product pricing plan.
        :param pulumi.Input[str] start_date_time: The point in time (in UTC) when the reservation starts.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ReservationState.__new__(_ReservationState)

        __props__.__dict__["assigned_resource_id"] = assigned_resource_id
        __props__.__dict__["auto_renew"] = auto_renew
        __props__.__dict__["auto_renew_disable_reason"] = auto_renew_disable_reason
        __props__.__dict__["end_date_time"] = end_date_time
        __props__.__dict__["initial_invoice_model"] = initial_invoice_model
        __props__.__dict__["last_renewal_date_time"] = last_renewal_date_time
        __props__.__dict__["location"] = location
        __props__.__dict__["next_billing_date"] = next_billing_date
        __props__.__dict__["next_renewal_date_time"] = next_renewal_date_time
        __props__.__dict__["price"] = price
        __props__.__dict__["price_unit"] = price_unit
        __props__.__dict__["product_category"] = product_category
        __props__.__dict__["product_code"] = product_code
        __props__.__dict__["reservation_model"] = reservation_model
        __props__.__dict__["sku"] = sku
        __props__.__dict__["start_date_time"] = start_date_time
        return Reservation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="assignedResourceId")
    def assigned_resource_id(self) -> pulumi.Output[str]:
        """
        The resource ID currently being assigned to reservation.
        """
        return pulumi.get(self, "assigned_resource_id")

    @property
    @pulumi.getter(name="autoRenew")
    def auto_renew(self) -> pulumi.Output[bool]:
        """
        A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
        """
        return pulumi.get(self, "auto_renew")

    @property
    @pulumi.getter(name="autoRenewDisableReason")
    def auto_renew_disable_reason(self) -> pulumi.Output[Optional[str]]:
        """
        The reason for disabling auto-renewal.
        """
        return pulumi.get(self, "auto_renew_disable_reason")

    @property
    @pulumi.getter(name="endDateTime")
    def end_date_time(self) -> pulumi.Output[str]:
        """
        The point in time (in UTC) when the reservation ends.
        """
        return pulumi.get(self, "end_date_time")

    @property
    @pulumi.getter(name="initialInvoiceModel")
    def initial_invoice_model(self) -> pulumi.Output[str]:
        """
        Reservations created with initial invoice model ON_CREATION will be invoiced on same date when reservation is created. Reservation created with CALENDAR_MONTH initial invoice model will be invoiced at the begining of next month.
        """
        return pulumi.get(self, "initial_invoice_model")

    @property
    @pulumi.getter(name="lastRenewalDateTime")
    def last_renewal_date_time(self) -> pulumi.Output[str]:
        """
        The point in time (in UTC) when the reservation was renewed last.
        """
        return pulumi.get(self, "last_renewal_date_time")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The location code.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter(name="nextBillingDate")
    def next_billing_date(self) -> pulumi.Output[str]:
        """
        Next billing date for reservation.
        """
        return pulumi.get(self, "next_billing_date")

    @property
    @pulumi.getter(name="nextRenewalDateTime")
    def next_renewal_date_time(self) -> pulumi.Output[str]:
        """
        The point in time (in UTC) when the reservation will be renewed if auto renew is set to true.
        """
        return pulumi.get(self, "next_renewal_date_time")

    @property
    @pulumi.getter
    def price(self) -> pulumi.Output[float]:
        """
        Reservation price.
        """
        return pulumi.get(self, "price")

    @property
    @pulumi.getter(name="priceUnit")
    def price_unit(self) -> pulumi.Output[str]:
        """
        The unit to which the price applies.
        """
        return pulumi.get(self, "price_unit")

    @property
    @pulumi.getter(name="productCategory")
    def product_category(self) -> pulumi.Output[str]:
        """
        The product category.
        """
        return pulumi.get(self, "product_category")

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> pulumi.Output[str]:
        """
        The code identifying the product. This code has significance across all locations.
        """
        return pulumi.get(self, "product_code")

    @property
    @pulumi.getter(name="reservationModel")
    def reservation_model(self) -> pulumi.Output[str]:
        """
        The reservation model.
        """
        return pulumi.get(self, "reservation_model")

    @property
    @pulumi.getter
    def sku(self) -> pulumi.Output[str]:
        """
        The SKU code of product pricing plan.
        """
        return pulumi.get(self, "sku")

    @property
    @pulumi.getter(name="startDateTime")
    def start_date_time(self) -> pulumi.Output[str]:
        """
        The point in time (in UTC) when the reservation starts.
        """
        return pulumi.get(self, "start_date_time")
