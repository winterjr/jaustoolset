/*
 * ex: set ro:
 * DO NOT EDIT.
 * generated by smc (http://smc.sourceforge.net/)
 * from file : StillImageClient_StillImageClientFSMContext.sm
 */

package src.urn_jts_StillImageClient_1_0;

import framework.internalEvents.*;
import src.urn_jts_StillImageClient_1_0.Messages.*;
import java.io.PrintStream;

public class StillImageClient_StillImageClientFSMContext
    extends statemap.FSMContext
{
//---------------------------------------------------------------
// Member methods.
//

    public StillImageClient_StillImageClientFSMContext(StillImageClient_StillImageClientFSM owner)
    {
        super (StillImageClient_StillImageClientFSM_SM.Ready);

        _owner = owner;
    }

    public StillImageClient_StillImageClientFSMContext(StillImageClient_StillImageClientFSM owner, StillImageClient_StillImageClientFSMState initState)
    {
        super (initState);

        _owner = owner;
    }

    public void enterStartState()
    {
        getState().Entry(this);
        return;
    }

    public void ReportStillImageDataTransition()
    {
        _transition = "ReportStillImageDataTransition";
        getState().ReportStillImageDataTransition(this);
        _transition = "";
        return;
    }

    public void ReportStillImageDataTransition(ReportStillImageData msg)
    {
        _transition = "ReportStillImageDataTransition";
        getState().ReportStillImageDataTransition(this, msg);
        _transition = "";
        return;
    }

    public void ReportStillImageSensorCapabilitiesTransition()
    {
        _transition = "ReportStillImageSensorCapabilitiesTransition";
        getState().ReportStillImageSensorCapabilitiesTransition(this);
        _transition = "";
        return;
    }

    public void ReportStillImageSensorConfigurationTransition()
    {
        _transition = "ReportStillImageSensorConfigurationTransition";
        getState().ReportStillImageSensorConfigurationTransition(this);
        _transition = "";
        return;
    }

    public StillImageClient_StillImageClientFSMState getState()
        throws statemap.StateUndefinedException
    {
        if (_state == null)
        {
            throw(
                new statemap.StateUndefinedException());
        }

        return ((StillImageClient_StillImageClientFSMState) _state);
    }

    protected StillImageClient_StillImageClientFSM getOwner()
    {
        return (_owner);
    }

    public void setOwner(StillImageClient_StillImageClientFSM owner)
    {
        if (owner == null)
        {
            throw (
                new NullPointerException(
                    "null owner"));
        }
        else
        {
            _owner = owner;
        }

        return;
    }

//---------------------------------------------------------------
// Member data.
//

    transient private StillImageClient_StillImageClientFSM _owner;

    public static abstract class StillImageClient_StillImageClientFSMState
        extends statemap.State
    {
    //-----------------------------------------------------------
    // Member methods.
    //

        protected StillImageClient_StillImageClientFSMState(String name, int id)
        {
            super (name, id);
        }

        protected void Entry(StillImageClient_StillImageClientFSMContext context) {}
        protected void Exit(StillImageClient_StillImageClientFSMContext context) {}

        protected void ReportStillImageDataTransition(StillImageClient_StillImageClientFSMContext context)
        {
            Default(context);
        }

        protected void ReportStillImageDataTransition(StillImageClient_StillImageClientFSMContext context, ReportStillImageData msg)
        {
            Default(context);
        }

        protected void ReportStillImageSensorCapabilitiesTransition(StillImageClient_StillImageClientFSMContext context)
        {
            Default(context);
        }

        protected void ReportStillImageSensorConfigurationTransition(StillImageClient_StillImageClientFSMContext context)
        {
            Default(context);
        }

        protected void Default(StillImageClient_StillImageClientFSMContext context)
        {
            if (context.getDebugFlag() == true)
            {
                PrintStream str = 
                    context.getDebugStream();

                str.println(
                    "TRANSITION   : Default");
            }

            throw (
                new statemap.TransitionUndefinedException(
                    "State: " +
                    context.getState().getName() +
                    ", Transition: " +
                    context.getTransition()));
        }

    //-----------------------------------------------------------
    // Member data.
    //
    }

    /* package */ static abstract class StillImageClient_StillImageClientFSM_SM
    {
    //-----------------------------------------------------------
    // Member methods.
    //

    //-----------------------------------------------------------
    // Member data.
    //

        //-------------------------------------------------------
        // Constants.
        //
        public static final StillImageClient_StillImageClientFSM_SM_Ready Ready =
            new StillImageClient_StillImageClientFSM_SM_Ready("StillImageClient_StillImageClientFSM_SM.Ready", 0);
        public static final StillImageClient_StillImageClientFSM_SM_Internally_Generated_State_DO_NOT_USE Internally_Generated_State_DO_NOT_USE =
            new StillImageClient_StillImageClientFSM_SM_Internally_Generated_State_DO_NOT_USE("StillImageClient_StillImageClientFSM_SM.Internally_Generated_State_DO_NOT_USE", 1);
        private static final StillImageClient_StillImageClientFSM_SM_Default Default =
            new StillImageClient_StillImageClientFSM_SM_Default("StillImageClient_StillImageClientFSM_SM.Default", -1);

    }

    protected static class StillImageClient_StillImageClientFSM_SM_Default
        extends StillImageClient_StillImageClientFSMState
    {
    //-----------------------------------------------------------
    // Member methods.
    //

        protected StillImageClient_StillImageClientFSM_SM_Default(String name, int id)
        {
            super (name, id);
        }
    //-----------------------------------------------------------
    // Member data.
    //
    }

    private static final class StillImageClient_StillImageClientFSM_SM_Ready
        extends StillImageClient_StillImageClientFSM_SM_Default
    {
    //-------------------------------------------------------
    // Member methods.
    //

        private StillImageClient_StillImageClientFSM_SM_Ready(String name, int id)
        {
            super (name, id);
        }

        protected void ReportStillImageDataTransition(StillImageClient_StillImageClientFSMContext context, ReportStillImageData msg)
        {
            StillImageClient_StillImageClientFSM ctxt = context.getOwner();

            if (context.getDebugFlag() == true)
            {
                PrintStream str = context.getDebugStream();

                str.println("LEAVING STATE   : StillImageClient_StillImageClientFSM_SM.Ready");
            }

            (context.getState()).Exit(context);
            if (context.getDebugFlag() == true)
            {
                PrintStream str = context.getDebugStream();

                str.println("ENTER TRANSITION: StillImageClient_StillImageClientFSM_SM.StillImageClient_StillImageClientFSM_SM.Ready.ReportStillImageDataTransition(ReportStillImageData msg)");
            }

            context.clearState();
            try
            {
                ctxt.DisplayStillImageAction(msg);
                ctxt.SendQueryStillImageDataAction();
                ctxt.processNotifications("Ready", null);
            }
            finally
            {
                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("EXIT TRANSITION : StillImageClient_StillImageClientFSM_SM.StillImageClient_StillImageClientFSM_SM.Ready.ReportStillImageDataTransition(ReportStillImageData msg)");
                }

                context.setState(StillImageClient_StillImageClientFSM_SM.Ready);
                (context.getState()).Entry(context);
            }
            return;
        }

    //-------------------------------------------------------
    // Member data.
    //
    }

    private static final class StillImageClient_StillImageClientFSM_SM_Internally_Generated_State_DO_NOT_USE
        extends StillImageClient_StillImageClientFSM_SM_Default
    {
    //-------------------------------------------------------
    // Member methods.
    //

        private StillImageClient_StillImageClientFSM_SM_Internally_Generated_State_DO_NOT_USE(String name, int id)
        {
            super (name, id);
        }

        protected void ReportStillImageDataTransition(StillImageClient_StillImageClientFSMContext context)
        {

            if (context.getDebugFlag() == true)
            {
                PrintStream str = context.getDebugStream();

                str.println("LEAVING STATE   : StillImageClient_StillImageClientFSM_SM.Internally_Generated_State_DO_NOT_USE");
            }

            if (context.getDebugFlag() == true)
            {
                PrintStream str = context.getDebugStream();

                str.println("ENTER TRANSITION: StillImageClient_StillImageClientFSM_SM.StillImageClient_StillImageClientFSM_SM.Internally_Generated_State_DO_NOT_USE.ReportStillImageDataTransition()");
            }

            if (context.getDebugFlag() == true)
            {
                PrintStream str = context.getDebugStream();

                str.println("EXIT TRANSITION : StillImageClient_StillImageClientFSM_SM.StillImageClient_StillImageClientFSM_SM.Internally_Generated_State_DO_NOT_USE.ReportStillImageDataTransition()");
            }

            return;
        }

        protected void ReportStillImageSensorCapabilitiesTransition(StillImageClient_StillImageClientFSMContext context)
        {

            if (context.getDebugFlag() == true)
            {
                PrintStream str = context.getDebugStream();

                str.println("LEAVING STATE   : StillImageClient_StillImageClientFSM_SM.Internally_Generated_State_DO_NOT_USE");
            }

            if (context.getDebugFlag() == true)
            {
                PrintStream str = context.getDebugStream();

                str.println("ENTER TRANSITION: StillImageClient_StillImageClientFSM_SM.StillImageClient_StillImageClientFSM_SM.Internally_Generated_State_DO_NOT_USE.ReportStillImageSensorCapabilitiesTransition()");
            }

            if (context.getDebugFlag() == true)
            {
                PrintStream str = context.getDebugStream();

                str.println("EXIT TRANSITION : StillImageClient_StillImageClientFSM_SM.StillImageClient_StillImageClientFSM_SM.Internally_Generated_State_DO_NOT_USE.ReportStillImageSensorCapabilitiesTransition()");
            }

            return;
        }

        protected void ReportStillImageSensorConfigurationTransition(StillImageClient_StillImageClientFSMContext context)
        {

            if (context.getDebugFlag() == true)
            {
                PrintStream str = context.getDebugStream();

                str.println("LEAVING STATE   : StillImageClient_StillImageClientFSM_SM.Internally_Generated_State_DO_NOT_USE");
            }

            if (context.getDebugFlag() == true)
            {
                PrintStream str = context.getDebugStream();

                str.println("ENTER TRANSITION: StillImageClient_StillImageClientFSM_SM.StillImageClient_StillImageClientFSM_SM.Internally_Generated_State_DO_NOT_USE.ReportStillImageSensorConfigurationTransition()");
            }

            if (context.getDebugFlag() == true)
            {
                PrintStream str = context.getDebugStream();

                str.println("EXIT TRANSITION : StillImageClient_StillImageClientFSM_SM.StillImageClient_StillImageClientFSM_SM.Internally_Generated_State_DO_NOT_USE.ReportStillImageSensorConfigurationTransition()");
            }

            return;
        }

    //-------------------------------------------------------
    // Member data.
    //
    }
}

/*
 * Local variables:
 *  buffer-read-only: t
 * End:
 */